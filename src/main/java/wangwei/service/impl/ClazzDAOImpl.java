package wangwei.service.impl;

import wangwei.dao.ClazzDAO;
import wangwei.entity.Clazz;
import wangwei.service.ClazzDAOService;
import wangwei.util.MybatisUtil;

import java.util.List;

public class ClazzDAOImpl implements ClazzDAOService {
    ClazzDAO clazzDAO = (ClazzDAO) MybatisUtil.getMapper(ClazzDAO.class);

    @Override
    public List<Clazz> findAll() {
        return clazzDAO.selectAll();
    }

    @Override
    public void deleteAll(int id) {
        clazzDAO.deleteAll(id);
        MybatisUtil.commit();
    }

    @Override
    public void insertAll(String name, String path, int tag_id) {
        clazzDAO.insertAll(name,path,tag_id);
        MybatisUtil.commit();
    }
}
