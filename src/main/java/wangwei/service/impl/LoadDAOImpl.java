package wangwei.service.impl;

import wangwei.dao.LoadDAO;
import wangwei.entity.User;
import wangwei.service.LoadDAOService;
import wangwei.util.MybatisUtil;

import java.util.List;

public class LoadDAOImpl implements LoadDAOService {
    LoadDAO loadDAO = (LoadDAO) MybatisUtil.getMapper(LoadDAO.class);
    @Override
    public List<User> findAll() {
        return loadDAO.selectAll();
    }

    @Override
    public User findByNameAndPassword(String name, String pwd) {
        return loadDAO.selectByNameAndPassword(name,pwd);
    }

    @Override
    public User findByName(String name) {
        return loadDAO.selectByName(name);
    }

    @Override
    public void addAll(User user) {
        loadDAO.insertAll(user);
        MybatisUtil.commit();
    }
}
