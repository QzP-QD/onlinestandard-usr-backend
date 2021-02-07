package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.StandardDO;

import java.util.List;

public interface StandardService {
    List<StandardDO> getStandardByBusiness(int businessID) throws Exception;
    StandardDO getStandardDetail(int standardID) throws Exception;
    List<String> getNames(List<Integer> idList) throws Exception;
}
