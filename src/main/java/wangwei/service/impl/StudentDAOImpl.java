package wangwei.service.impl;

import wangwei.dao.StudentDAO;
import wangwei.entity.Student;
import wangwei.service.StudentDAOService;
import wangwei.util.MybatisUtil;

import java.util.List;

public class StudentDAOImpl implements StudentDAOService {
    StudentDAO studentDAO = (StudentDAO) MybatisUtil.getMapper(StudentDAO.class);
    @Override
    public List<Student> findList() {
        return studentDAO.getList();
    }
    //添加所有学生信息
    @Override
    public void addAll(Student student) {
        studentDAO.insertAll(student);
        MybatisUtil.commit();
    }

    @Override
    public void changeAll(int id, String name, String bir, String qq, String phone, int clazz_id, int group_id, int city, int tag, String mark) {
        studentDAO.changeStudent(id,name,bir,qq,phone,clazz_id,group_id,city,tag,mark);
        MybatisUtil.commit();
    }

    @Override
    public void deleteAll(int id) {
        studentDAO.deleteStudent(id);
        MybatisUtil.commit();
    }

    @Override
    public Integer findCount() {
        return studentDAO.selectCount();
    }

    @Override
    public List<Student> findByPage(int page) {
        return studentDAO.selectByPage(page);
    }
}
