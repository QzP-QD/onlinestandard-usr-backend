package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.BusinessDO;

import java.util.List;

public interface BusinessService {
    List<BusinessDO> getBusiness() throws Exception;
    int getBusinessId(String name) throws Exception;
}
