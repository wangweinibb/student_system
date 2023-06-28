package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import wangwei.dao.TagDAO;
import wangwei.service.impl.TagDAOImpl;
import wangwei.util.MybatisUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TagController extends ActionSupport {
    private int id;
    private String name;
    private String type;
    HttpServletRequest request = ServletActionContext.getRequest();
    TagDAOImpl tagDAO=new TagDAOImpl();
    //查询所有标签信息
    public String getAll(){
        request.setAttribute("allTag",tagDAO.findAll());
        MybatisUtil.close();
        return "success";
    }
    //新增标签
    public String addTag(){
        tagDAO.addTag(name,type,new SimpleDateFormat().format(new Date()));
        MybatisUtil.close();
        return "success";
    }
    //删除标签
    public String deleteTag(){
        tagDAO.deleteTag(id);
        MybatisUtil.close();
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
