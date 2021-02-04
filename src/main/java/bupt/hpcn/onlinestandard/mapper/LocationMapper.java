package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.CityDO;
import bupt.hpcn.onlinestandard.domain.ProvinceDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LocationMapper {
    List<ProvinceDO> getProvince();
    List<CityDO> getCity();
}
