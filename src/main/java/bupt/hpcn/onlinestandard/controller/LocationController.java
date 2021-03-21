package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.domain.CityDO;
import bupt.hpcn.onlinestandard.domain.ProvinceDO;
import bupt.hpcn.onlinestandard.service.LocationService;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/getLoc")
    public Object getProv() throws Exception{
        List<ProvinceDO> provList = locationService.getProvince();
        List<CityDO>  cityList = locationService.getCity();
        List<JSONObject> resultprov = new LinkedList<>();
        List<JSONObject> resultcity = new LinkedList<>();

        for(ProvinceDO myprov : provList){
            JSONObject temp = new JSONObject();
            temp.put("label",myprov.getName());
            temp.put("value",myprov.getName());
            temp.put("id",myprov.getId());
            resultprov.add(temp);
        }

        for(CityDO mycity : cityList){
            JSONObject temp = new JSONObject();
            temp.put("label",mycity.getName());
            temp.put("id",mycity.getId());
            for(ProvinceDO myprov : provList){
                if(mycity.getProv_id() == myprov.getId()){
                    temp.put("prov",myprov.getName());
                    break;
                }
            }
            resultcity.add(temp);
        }

        JSONObject resultobj = new JSONObject();
        resultobj.put("provs", resultprov);
        resultobj.put("allCities", resultcity);
        resultobj.put("code",0);

        return resultobj;
    }
}
