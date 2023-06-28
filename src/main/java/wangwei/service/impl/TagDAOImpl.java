package wangwei.service.impl;

import wangwei.entity.Tag;
import wangwei.service.TagDAO;
import wangwei.util.MybatisUtil;

import java.util.List;

public class TagDAOImpl implements TagDAO {
    wangwei.dao.TagDAO tagDAO = (wangwei.dao.TagDAO) MybatisUtil.getMapper(wangwei.dao.TagDAO.class);

    @Override
    public List<Tag> findAll() {
        return tagDAO.selectAll();
    }

    @Override
    public void addTag(String name, String type,String createDate) {
        tagDAO.insertTag(name,type,createDate);
        MybatisUtil.commit();
    }

    @Override
    public void deleteTag(int id) {
        tagDAO.deleteTag(id);
        MybatisUtil.commit();
    }

    @Override
    public List<Tag> findByClazz() {
        return tagDAO.selectByClazz();
    }

    @Override
    public List<Tag> findByStudent() {
        return tagDAO.selectByStudent();
    }
}
