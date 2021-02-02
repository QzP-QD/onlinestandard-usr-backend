package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.StandardDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StandardMapper {
    //通过 行业 获取场景标准
    List<StandardDO> getStandardByBusiness();
}
