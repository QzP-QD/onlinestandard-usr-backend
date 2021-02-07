package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.StandardItemDO;
import bupt.hpcn.onlinestandard.mapper.StandardItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("standardItemService")
public class StandardItemServiceImpl implements StandardItemService{
    @Autowired
    private StandardItemMapper standardItemMapper;

    @Override
    public List<StandardItemDO> getStandardItemByStandard(List<Integer> standardID) throws Exception{
        return standardItemMapper.getStandardItemByStandard(standardID);
    }
}
