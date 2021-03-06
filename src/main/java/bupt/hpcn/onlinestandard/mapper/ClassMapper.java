package bupt.hpcn.onlinestandard.mapper;

import bupt.hpcn.onlinestandard.domain.ClassDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassMapper {
    List<ClassDO> getMyClass(int id, String name);
    List<ClassDO> getAllClasses();
}
