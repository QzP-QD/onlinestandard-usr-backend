package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.ClassDO;
import bupt.hpcn.onlinestandard.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classService")
public class ClassServiceImpl implements ClassService{
    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<ClassDO> getClass(int id, String name) {
        return classMapper.getClass(id, name);
    }
}
