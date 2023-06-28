package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import wangwei.dao.GroupDAO;
import wangwei.service.impl.ClazzDAOImpl;
import wangwei.service.impl.GroupDAOImpl;
import wangwei.util.MybatisUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroupController extends ActionSupport {
    private int id;
    private String group_name;
    private int clazz_id;
    GroupDAOImpl groupDAO=new GroupDAOImpl();
    ClazzDAOImpl clazzDAO=new ClazzDAOImpl();
    //加载所有小组信息
    public String getAll(){
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("allGroup1",groupDAO.findAll());
        MybatisUtil.close();
        return "success";
    }
    //查询所有班级
    public String findClazz(){
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("all",clazzDAO.findAll());
        MybatisUtil.close();
        return "success";
    }
    //添加小组信息
    public String addGroup(){
        groupDAO.addGroup(group_name,clazz_id,new SimpleDateFormat().format(new Date()));
        MybatisUtil.close();
        return "success";
    }
    //删除小组信息
    public String removeGroup(){
        groupDAO.removeAll(id);
        MybatisUtil.close();
        return "success";
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(int clazz_id) {
        this.clazz_id = clazz_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
