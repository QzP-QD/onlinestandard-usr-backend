package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.domain.BusinessDO;
import bupt.hpcn.onlinestandard.service.BusinessService;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @RequestMapping("/getBusiness")
    public Object getBusiness() throws Exception{
        List<BusinessDO> result = businessService.getBusiness();
        JSONObject jobj = new JSONObject();
        jobj.put("BusinessData",result);
        jobj.put("code",0);

        return jobj;
    }
}
