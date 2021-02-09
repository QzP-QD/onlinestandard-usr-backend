package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.StandardDO;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface StandardService {
    List<StandardDO> getStandardByBusiness(int businessID) throws Exception;
    StandardDO getStandardDetail(int standardID) throws Exception;
    List<JSONObject> getNames(List<Integer> idList) throws Exception;
}
