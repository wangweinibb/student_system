package wangwei.service;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.User;

import java.util.List;

public interface LoadDAOService {
    //查询所有
    public List<User> findAll();
    //根据用户名跟密码查询
    public User findByNameAndPassword(@Param(value = "name") String name, @Param(value = "pwd") String pwd);
    //根据用户名查询
    public User findByName(@Param(value = "name") String name);
    //新增信息
    public void addAll(User user);
}
