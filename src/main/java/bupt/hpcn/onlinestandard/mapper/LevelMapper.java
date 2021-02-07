package bupt.hpcn.onlinestandard.mapper;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LevelMapper {
    List<JSONObject> getAll();
}
