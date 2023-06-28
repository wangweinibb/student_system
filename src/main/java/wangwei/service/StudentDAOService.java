package wangwei.service;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.Student;

import java.util.List;

public interface StudentDAOService {
    //获取所有学生信息
    public List<Student> findList();
    //添加所有信息
    public void addAll(Student student);
    //修改学生信息
    public void changeAll(int id,String name,String bir,String qq,String phone,int clazz_id,int group_id,int city,int tag,String mark);
    //删除学生信息
    public void deleteAll(int id);
    //查询总条数
    public Integer findCount();
    //显示分页
    public List<Student> findByPage(int page);
}
