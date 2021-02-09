package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.StandardDO;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StandardMapper {
    //通过 行业 获取场景标准
    List<StandardDO> getStandardByBusiness(Integer businessID);
    //通过 id 获取场景标准详情（仅standard_table中）
    StandardDO getStandardDetail(Integer standardID);
    //获取场景标准名称列表
    List<JSONObject> getNames(List<Integer> idList);
}
