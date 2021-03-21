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
    public List<ClassDO> getMyClass(int id, String name)throws Exception {
        return classMapper.getMyClass(id, name);
    }

    @Override
    public List<ClassDO> getAllClasses() throws Exception {
        return classMapper.getAllClasses();
    }
}
