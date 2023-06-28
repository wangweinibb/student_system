package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import wangwei.dao.CityDAO;
import wangwei.service.impl.CityDAOImpl;
import wangwei.util.MybatisUtil;

import javax.servlet.http.HttpServletRequest;

public class CityController extends ActionSupport {
    private int id;
    private String name;
    CityDAOImpl cityDAO=new CityDAOImpl();
    HttpServletRequest request = ServletActionContext.getRequest();
//    查询所有城市信息
    public String getAll(){
        request.setAttribute("allCity",cityDAO.findAll());
        MybatisUtil.close();
        return "success";
    }
    //添加城市
    public String addCity(){
        cityDAO.addCity(name);
        MybatisUtil.close();
        return "success";
    }
    //删除城市
    public String deleteCity(){
        cityDAO.deleteById(id);
        MybatisUtil.close();
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
