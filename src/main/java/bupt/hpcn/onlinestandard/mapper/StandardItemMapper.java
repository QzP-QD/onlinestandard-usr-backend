package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.StandardItemDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StandardItemMapper {
    List<StandardItemDO> getStandardItemByStandard(List<Integer> standardID);
}
