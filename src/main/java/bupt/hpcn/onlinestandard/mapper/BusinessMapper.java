package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.BusinessDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BusinessMapper {
    int getBusinessId(String name);
    List<BusinessDO> getBusiness();
}
