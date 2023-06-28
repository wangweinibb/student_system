import org.junit.Test;
import wangwei.dao.StudentDAO;
import wangwei.service.impl.StudentDAOImpl;
import wangwei.util.MybatisUtil;

public class Student {
    StudentDAO studentDAO = (StudentDAO) MybatisUtil.getMapper(StudentDAO.class);
    StudentDAOImpl studentDAO1=new StudentDAOImpl();
    @Test
    public void getList(){
        System.out.println(studentDAO.getList());
    }
    @Test
    public void findAll(){
        System.out.println(studentDAO1.findList());
    }
    @Test
    public void insertAll(){
        wangwei.entity.Student student=new wangwei.entity.Student(0,"金磊",19,"2933610486","19164003507","2023-10-23","星座","生肖","备注",4,3,1,0,null,null,null,null);
        studentDAO.insertAll(student);
        System.out.println(student);
        MybatisUtil.commit();
    }
    @Test
    public void addAll(){
        wangwei.entity.Student student=new wangwei.entity.Student(0,"周杰伦",19,"2933610486","19164003507","2023-10-23","星座","生肖","备注",4,3,1,0,null,null,null,null);
        studentDAO1.addAll(student);
    }
//    修改学生信息
    @Test
    public void changeAll(){
        studentDAO.changeStudent(21,"金磊","2003-10-23","2933610486","19164003507",9,8,2,10,"我是帅哥");
        MybatisUtil.commit();
    }
    @Test
    public void modifiAll(){
        studentDAO1.changeAll(18,"金磊","2003-10-23","2933610486","19164003507",9,8,2,10,"我是帅哥");
    }
//    删除学生信息
    @Test
    public void deleteAll(){
        studentDAO.deleteStudent(21);
        MybatisUtil.commit();
    }
//    查询所有学生信息条数
    @Test
    public void selectCount(){
        System.out.println(studentDAO.selectCount());
    }
    @Test
    public void findCount(){
        System.out.println(studentDAO1.findCount());
    }
//    显示分页
    @Test
    public void selectByPage(){
        System.out.println(studentDAO.selectByPage(0));
    }
    @Test
    public void findByPage(){
        System.out.println(studentDAO1.findByPage(1));
    }
}
