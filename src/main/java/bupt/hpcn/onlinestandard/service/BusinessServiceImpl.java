package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.BusinessDO;
import bupt.hpcn.onlinestandard.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService{
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<BusinessDO> getBusiness() {
        return businessMapper.getBusiness();
    }

    @Override
    public int getBusinessId(String name) {
        return businessMapper.getBusinessId(name);
    }
}
