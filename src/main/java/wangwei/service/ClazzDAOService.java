package wangwei.service;

import wangwei.entity.Clazz;
import wangwei.entity.Tag;

import java.util.List;

public interface ClazzDAOService {
    //查询所有
    public List<Clazz> findAll();
    //删除班级
    public void deleteAll(int id);

    void insertAll(String name, String path, int tag_id);
//    //添加班级
//    public void insertAll(String name,String path,int tag_id);
}
