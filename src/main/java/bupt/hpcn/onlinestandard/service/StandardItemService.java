package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.StandardItemDO;

import java.util.List;

public interface StandardItemService {
    List<StandardItemDO> getStandardItemByStandard(List<Integer> standardID);
}
