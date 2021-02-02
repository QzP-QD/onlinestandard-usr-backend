package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @RequestMapping("/getBybusinessid")
    public Object getByBusiness(){
        return standardService.getStandardByBusiness();
    }
}
