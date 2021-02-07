package bupt.hpcn.onlinestandard.service;

import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface PropertyInfoService {
    List<JSONObject> getPropertyInfo(List<Integer> itemids);
}
