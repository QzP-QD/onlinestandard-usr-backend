package bupt.hpcn.onlinestandard.service;

import bupt.hpcn.onlinestandard.domain.ClassDO;

import java.util.List;

public interface ClassService {
    List<ClassDO> getMyClass(int id, String name) throws Exception;
}
