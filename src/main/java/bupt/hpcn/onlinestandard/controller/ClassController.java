package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping(value="/getClass", method= RequestMethod.GET)
    public Object getMyClass(){
        int selectID = 0;
        String selectName = "行业标准";

        return classService.getClass(selectID, selectName);
    }
}
