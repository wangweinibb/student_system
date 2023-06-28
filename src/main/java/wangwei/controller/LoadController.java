package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import wangwei.dao.LoadDAO;
import wangwei.entity.User;
import wangwei.service.impl.LoadDAOImpl;
import wangwei.util.MybatisUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoadController extends ActionSupport {
    private int id;
    private String name;
    private String pwd;
    private String createDate;
    private String role;
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    LoadDAOImpl loadDAO=new LoadDAOImpl();
    //注册
    public String regist() {
        User user = new User(name, pwd,new SimpleDateFormat().format(new Date()),role);
        loadDAO.addAll(user);;
        MybatisUtil.commit();
        MybatisUtil.close();
        return "success";
    }
    //登陆
    public String login(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String storeCode = (String) session.getAttribute("code");
        if (code.equals(storeCode)){
            if (loadDAO.findByName(name)!=null){
                if (loadDAO.findByNameAndPassword(name,pwd)!=null){
                    session.setAttribute("user",loadDAO.findByNameAndPassword(name,pwd));
                    MybatisUtil.close();
                    return "success";
                }else {
                    MybatisUtil.close();
                    return "error3";
                }
            }else {
                MybatisUtil.close();
                return "error2";
            }
        }else {
            MybatisUtil.close();
            return "error1";
        }
    }
    //登出
    public String logout(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        MybatisUtil.close();
        return "success";
    }
}
