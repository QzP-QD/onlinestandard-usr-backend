package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.mapper.PropertyInfoMapper;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("propertyInfoService")
public class PropertyInfoServiceImpl implements PropertyInfoService{
    @Autowired
    private PropertyInfoMapper propertyInfoMapper;

    @Override
    public List<JSONObject> getPropertyInfo(List<Integer> itemids) throws Exception{
        return propertyInfoMapper.getPropertyInfo(itemids);
    }
}
