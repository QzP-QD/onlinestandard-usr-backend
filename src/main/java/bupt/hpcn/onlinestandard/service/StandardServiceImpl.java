package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.mapper.StandardMapper;
import bupt.hpcn.onlinestandard.domain.StandardDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("standardService")
public class StandardServiceImpl implements StandardService{
    @Autowired
    private StandardMapper standardMapper;

    @Override
    public List<StandardDO> getStandardByBusiness(int businessID) {
        return standardMapper.getStandardByBusiness(businessID);
    }
}
