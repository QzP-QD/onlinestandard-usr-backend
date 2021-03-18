package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.domain.*;
import bupt.hpcn.onlinestandard.mapper.LevelMapper;
import bupt.hpcn.onlinestandard.service.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.awt.image.ImageWatched;
import sun.rmi.server.InactiveGroupException;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value="/api/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;
    @Autowired
    private BusinessService businessService;
    @Autowired
    private ClassService classService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private StandardItemService standardItemService;
    @Autowired
    private LevelService levelService;
    @Autowired
    private PropertyInfoService propertyInfoService;

    @GetMapping(value="/getBybusiness")
    public Object getByBusiness(String activeBusiness) throws Exception{
        int businessID = businessService.getBusinessId(activeBusiness);

        int classID = 0; String className = "";
        //获取标准分类列表，方便篡数据
        List<ClassDO> classList = classService.getMyClass(classID, className);
        //获取城市列表，方便篡数据
        List<CityDO> cityList = locationService.getCity();
        //获取省份列表，方便篡数据
        List<ProvinceDO> provList = locationService.getProvince();

        List<StandardDO> resultList = standardService.getStandardByBusiness(businessID);
        List<JSONObject> mylist = new LinkedList<>();
        for(int i = 0 ; i < resultList.size() ; i ++){
            JSONObject tempobj = new JSONObject();
            tempobj.put("id", resultList.get(i).getId());
            tempobj.put("name", resultList.get(i).getName());
            tempobj.put("date", resultList.get(i).getDate());

            for(ClassDO myclass: classList){
                if(myclass.getId() == resultList.get(i).getClass_id()){
                    tempobj.put("class_name", myclass.getName());
                    break;
                }
            }
            for(CityDO mycity: cityList){
                if(mycity.getId() == resultList.get(i).getCity_id()){
                    tempobj.put("city_name", mycity.getName());
                    break;
                }
            }
            for(ProvinceDO myprov: provList){
                if(myprov.getId() == resultList.get(i).getProvince_id()){
                    tempobj.put("province_name", myprov.getName());
                    break;
                }
            }
            mylist.add(tempobj);
        }

        JSONObject resultobj = new JSONObject();
        resultobj.put("standardList",mylist);
        resultobj.put("code",0);

        return resultobj;
    }

    @GetMapping(value="/getDetail")
    public Object getDetial(int standardID) throws Exception{
        StandardDO resultDO = standardService.getStandardDetail(standardID);
        //"standardDetail"的内容
        JSONObject standardDetail = new JSONObject();
        standardDetail.put("id", resultDO.getId());
        standardDetail.put("name", resultDO.getName());

        //1、通过standard_id获取 standard_item_table 和items_table 中的对应条目
        List<Integer> standardIDs = new LinkedList<>();
        standardIDs.add(resultDO.getId());
        List<StandardItemDO> standardItemDOList = standardItemService.getStandardItemByStandard(standardIDs);
        //2、第一步中如果有关联设备，从property_table中通过嵌套item_property_table查询得到equip_id
        List<Integer> relatedID = new LinkedList<>();
        for(StandardItemDO sid: standardItemDOList){
            if(sid.isProperty_related()){
                relatedID.add(sid.getItem_id());
            }
        }

        List<JSONObject> propertyInfo = new LinkedList<>();
        if(relatedID.size() > 0){
            propertyInfo = propertyInfoService.getPropertyInfo(relatedID);
        }

        //3、获取first_level_table和second_level_table中的内容
        List<JSONObject> levelInfo = levelService.getAll();

        //4、攒json对象
        JSONObject resultobj = new JSONObject();

        List<JSONObject> items = new LinkedList<>();
        if(standardItemDOList.size() > 0){
            for(StandardItemDO sid: standardItemDOList){
                JSONObject temp = new JSONObject();
                temp.put("item_id", sid.getItem_id());
                for(JSONObject obj : levelInfo){
                    if((Integer)obj.get("id") == sid.getItem().getSecond_level_id()){
                        temp.put("first_level", obj.get("firstName"));
                        temp.put("second_level", obj.get("secondName"));
                        break;
                    }
                }
                temp.put("detial", sid.getItem().getShort_cut());
                temp.put("property_related", sid.isProperty_related());
                temp.put("equip_name","");
                temp.put("property_name","");
                temp.put("property_type",sid.getProperty_type());
                temp.put("value_1",sid.getValue1());
                temp.put("value_2",sid.getValue2());

                temp.put("requested", sid.isRequired());
                if(relatedID.size() > 0){
                    for(JSONObject obj2: propertyInfo){
                        if(obj2.get("item_id") == temp.get("item_id")){
                            temp.put("equip_name",obj2.get("equipName"));
                            temp.put("property_name",obj2.get("propName"));
                        }
                    }
                }

                items.add(temp);
            }
        }

        standardDetail.put("items", items);
        resultobj.put("standardDetial", standardDetail);
        resultobj.put("code",0);

        return resultobj;
    }

    @PostMapping(value="/MergePage")
//    @RequestBody String idLists
    public Object getMerge(@RequestBody String idLists) throws Exception{
        List<Integer> tempList = new LinkedList<>();

        List<Integer> idList = JSONArray.parseArray(idLists,Integer.class);
//        List<Integer> idList = new LinkedList<>();
//        idList.add(12);idList.add(13);idList.add(14);
        //1、获取所有的 standard_item 信息
        List<StandardItemDO> standardItemDOList = standardItemService.getStandardItemByStandard(idList);

        //2、获取等级信息
        List<JSONObject> levelInfo = levelService.getAll();

        //3、攒对象
        JSONObject resultobj = new JSONObject();

        List<JSONObject> names = standardService.getNames(idList);
        resultobj.put("names",names);

        List<JSONObject> items = new LinkedList<>();
        System.out.println(standardItemDOList.size());
        if(standardItemDOList.size() > 0){
            for(StandardItemDO sid: standardItemDOList){
                JSONObject temp = new JSONObject();
                temp.put("item_id", sid.getItem_id());
                int standardID = sid.getStandard_id();
                for(JSONObject item : names){
                    if(standardID == (Integer)item.get("id")){
                        temp.put("standard_name", (String)item.get("name"));
                        break;
                    }
                }
                for(JSONObject obj : levelInfo){
                    if((Integer)obj.get("id") == sid.getItem().getSecond_level_id()){
                        temp.put("first_level", obj.get("firstName"));
                        temp.put("second_level", obj.get("secondName"));
                        break;
                    }
                }
                temp.put("detial", sid.getItem().getShort_cut());
                items.add(temp);
            }
        }
        resultobj.put("items", items);
        resultobj.put("code",0);

        return resultobj;
    }
}
