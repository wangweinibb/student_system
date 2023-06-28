package wangwei.service.impl;

import wangwei.dao.GroupDAO;
import wangwei.entity.Clazz;
import wangwei.entity.Group;
import wangwei.service.GroupDAOService;
import wangwei.util.MybatisUtil;

import java.util.List;

public class GroupDAOImpl implements GroupDAOService {
    GroupDAO groupDAO = (GroupDAO) MybatisUtil.getMapper(GroupDAO.class);
    @Override
    public List<Group> findAll() {
        return groupDAO.selectAll();
    }

    @Override
    public List<Group> fingGroupMessage() {
        return groupDAO.selectGroupMessage();
    }

    @Override
    public void removeAll(int id) {
        groupDAO.deleteAll(id);
        MybatisUtil.commit();
    }

    @Override
    public void addGroup(String group_name, int clazz_id, String createDate) {
        groupDAO.insertGroup(group_name,clazz_id,createDate);
        MybatisUtil.commit();
    }
}
