package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.CityDO;
import bupt.hpcn.onlinestandard.domain.ProvinceDO;
import bupt.hpcn.onlinestandard.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("locationService")
public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<ProvinceDO> getProvince() {
        return locationMapper.getProvince();
    }

    @Override
    public List<CityDO> getCity() {
        return locationMapper.getCity();
    }
}
