package wangwei.dao;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.Student;

import java.util.List;

public interface StudentDAO {
    //获取所有学生信息
    public List<Student> getList();
    //新增学生信息
    public void insertAll(Student student);
    //修改学生信息
    public void changeStudent(@Param(value = "id") int id, @Param(value = "name") String name, @Param(value = "bir") String bir, @Param(value = "qq") String qq, @Param(value = "phone") String phone, @Param(value = "clazz_id") int clazz_id,@Param(value = "group_id") int group_id, @Param(value = "city") int city, @Param(value = "tag") int tag, @Param(value = "mark") String mark);
    //删除学生
    public void deleteStudent(@Param(value = "id") int id);
    //分页查询
    public Integer selectCount();
    //显示页数
    public List<Student> selectByPage(@Param(value = "page") int page);
}

