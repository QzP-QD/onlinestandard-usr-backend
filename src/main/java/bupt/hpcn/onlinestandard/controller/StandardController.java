package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.domain.StandardDO;
import bupt.hpcn.onlinestandard.service.BusinessService;
import bupt.hpcn.onlinestandard.service.StandardService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/standard")
public class StandardController {
    @Autowired
    private StandardService standardService;

    @Autowired
    private BusinessService businessService;

    @RequestMapping(value="/getBybusiness", method=RequestMethod.GET)
    public Object getByBusiness(String activeBusiness){
        System.out.println(activeBusiness);
        int businessID = businessService.getBusinessId(activeBusiness);

        System.out.println(businessID);
        List<StandardDO> resultList = standardService.getStandardByBusiness(businessID);
        JSONObject resultobj = new JSONObject();
        resultobj.put("standardList", resultList);

        return resultobj;
    }
}
