package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.StandardDO;

import java.util.List;

public interface StandardService {
    List<StandardDO> getStandardByBusiness(int businessID);
    StandardDO getStandardDetail(int standardID);
    List<String> getNames(List<Integer> idList);
}
