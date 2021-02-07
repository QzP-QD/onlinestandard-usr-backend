package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.CityDO;
import bupt.hpcn.onlinestandard.domain.ProvinceDO;

import java.util.List;

public interface LocationService {
    List<ProvinceDO> getProvince() throws Exception;
    List<CityDO> getCity() throws Exception;
}
