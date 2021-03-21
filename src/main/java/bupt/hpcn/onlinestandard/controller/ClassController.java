package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.domain.ClassDO;
import bupt.hpcn.onlinestandard.service.ClassService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping(path="/getAllClasses")
    public Object getAllClasses() throws Exception{
        JSONObject resultobj = new JSONObject();
        List<ClassDO> classList = classService.getAllClasses();

        resultobj.put("result", classList);
        resultobj.put("code", 0);
        return resultobj;
    }

    @GetMapping(value="/getClass")
    public Object getMyClass(int id, String name) throws Exception{
        int selectID = id;
        String selectName = name;
        List<ClassDO> classList = classService.getMyClass(selectID, selectName);
        List<JSONObject> resultList = new LinkedList<>();
        for(ClassDO myclass : classList){
            JSONObject tempobj = new JSONObject();
            tempobj.put("label", myclass.getName());
            tempobj.put("value", myclass.getName());

            resultList.add(tempobj);
        }

        return resultList;
    }
}
