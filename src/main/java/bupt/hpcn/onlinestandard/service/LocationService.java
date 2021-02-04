package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.CityDO;
import bupt.hpcn.onlinestandard.domain.ProvinceDO;

import java.util.List;

public interface LocationService {
    List<ProvinceDO> getProvince();
    List<CityDO> getCity();
}
