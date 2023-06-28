package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import wangwei.dao.StudentDAO;
import wangwei.entity.Student;
import wangwei.service.impl.CityDAOImpl;
import wangwei.service.impl.GroupDAOImpl;
import wangwei.service.impl.StudentDAOImpl;
import wangwei.service.impl.TagDAOImpl;
import wangwei.util.Birthday;
import wangwei.util.MybatisUtil;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentController extends ActionSupport {
    private int id;
    private String name;
    private String bir;
    private String qq;
    private String phone;
    private String clazz_name;
    private String group_name;
    private String city_name;
    private String clazzGroupId;
    private int city_id;
    private int tag_id;
    private String mark;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClazzGroupId() {
        return clazzGroupId;
    }

    public void setClazzGroupId(String clazzGroupId) {
        this.clazzGroupId = clazzGroupId;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClazz_name() {
        return clazz_name;
    }

    public void setClazz_name(String clazz_name) {
        this.clazz_name = clazz_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    HttpServletRequest request = ServletActionContext.getRequest();
    StudentDAOImpl studentDAO=new StudentDAOImpl();
    GroupDAOImpl groupDAO=new GroupDAOImpl();
    CityDAOImpl cityDAO=new CityDAOImpl();
    TagDAOImpl tagDAO=new TagDAOImpl();
    //获取学生信息
    public String getList(){
        request.setAttribute("student",studentDAO.findList());
        request.setAttribute("totalCount",studentDAO.findCount()/10+1);
        MybatisUtil.close();
        return "success";
    }
    //显示小组城市下拉选项以及标签
    public String getMany(){
        request.setAttribute("allGroup1",groupDAO.fingGroupMessage());
        request.setAttribute("allCity",cityDAO.findAll());
        request.setAttribute("allTag",tagDAO.findByStudent());
        System.out.println("--------------------------");
        System.out.println(groupDAO.fingGroupMessage());
        MybatisUtil.close();
        return "success";
    }
    //添加学生信息
    public String addStudent(){
        System.out.println("===========用户注册信息===================");
        System.out.println(name+";"+bir+";"+qq+";"+phone+";"+clazzGroupId+";"+city_id+";"+tag_id+";"+mark);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate date = LocalDate.parse(bir, formatter);
        Student student=new Student(0,name, Birthday.calculateAge(String.valueOf(date)),qq,phone,bir,Birthday.calculateConstellation(String.valueOf(date)),Birthday.calculateZodiac(String.valueOf(date)),mark,Integer.parseInt(clazzGroupId.substring(0,clazzGroupId.indexOf("#"))), Integer.parseInt(clazzGroupId.substring(clazzGroupId.indexOf("#")+1)),city_id,0,null,null,null,null);
        System.out.println(student);
        studentDAO.addAll(student);
        MybatisUtil.close();
        return "success";
    }
    //修改学生信息
    public String changeStudent(){
        System.out.println(id+";"+name+";"+bir+";"+qq+";"+phone+";"+clazz_name+";"+group_name+";"+city_name);
        request.setAttribute("id",id);
        request.setAttribute("name",name);
        request.setAttribute("bir",bir);
        request.setAttribute("qq",qq);
        request.setAttribute("phone",phone);
        request.setAttribute("clazz_name",clazz_name);
        request.setAttribute("group_name",group_name);
        request.setAttribute("city_name",city_name);
        request.setAttribute("allGroup",groupDAO.fingGroupMessage());
        request.setAttribute("allCity",cityDAO.findAll());
        request.setAttribute("allTag",tagDAO.findAll());
        MybatisUtil.close();
        return "success";
    }
    //更新学生信息
    public String updateStudent(){
        System.out.println("学生id:"+id);
        System.out.println("学生姓名"+name);
        System.out.println("学生生日"+bir);
        System.out.println("学生qq"+qq);
        System.out.println("学生手机号码"+phone);
        System.out.println("班级id+小组id:"+clazzGroupId);
        System.out.println("就业城市id:"+city_id);
        System.out.println("标签id:"+tag_id);
        System.out.println("备注:"+mark);
        studentDAO.changeAll(id,name,bir,qq,phone,Integer.parseInt(clazzGroupId.substring(0,clazzGroupId.indexOf("#"))), Integer.parseInt(clazzGroupId.substring(clazzGroupId.indexOf("#")+1)),city_id,tag_id,mark);
        MybatisUtil.close();
        return "success";
    }
    //删除学生信息
    public String removeStudent(){
        studentDAO.deleteAll(id);
        return "success";
    }
}
