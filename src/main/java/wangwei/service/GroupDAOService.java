package wangwei.service;

import wangwei.entity.Clazz;
import wangwei.entity.Group;

import java.util.List;

public interface GroupDAOService {
    //查询所有
    public List<Group> findAll();
    //查询小组有关学生信息
    public List<Group> fingGroupMessage();
    //删除小组
    public void removeAll(int id);
    //添加小组
    public void addGroup(String group_name,int clazz_id,String createDate);
}
