package wangwei.service;

import wangwei.entity.Tag;

import java.util.List;

public interface TagDAO {
    //查询所有
    public List<Tag> findAll();
    //添加标签
    public void addTag(String name,String type,String createDate);
    //删除标签
    public void deleteTag(int id);
    //查询所有班级标签
    public List<Tag> findByClazz();
    //查询所有学生标签
    public List<Tag> findByStudent();
}
