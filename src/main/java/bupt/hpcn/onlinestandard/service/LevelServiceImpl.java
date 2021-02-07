package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.mapper.LevelMapper;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("levelService")
public class LevelServiceImpl implements LevelService{
    @Autowired
    private LevelMapper levelMapper;

    @Override
    public List<JSONObject> getAll() {
        return levelMapper.getAll();
    }
}
