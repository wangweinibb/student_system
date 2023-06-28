import org.junit.Test;
import wangwei.dao.LoadDAO;
import wangwei.entity.User;
import wangwei.service.impl.LoadDAOImpl;
import wangwei.util.MybatisUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Load {
    LoadDAO loadDAO = (LoadDAO) MybatisUtil.getMapper(LoadDAO.class);
    LoadDAOImpl loadDAO1 = new LoadDAOImpl();

    //查询所有
    @Test
    public void selectAll() {
        System.out.println(loadDAO.selectAll());
        MybatisUtil.close();
    }

    @Test
    public void findAll() {
        System.out.println(loadDAO1.findAll());
    }

    // 根据用户名和密码查询
    @Test
    public void selectByNameAndPassword() {
        System.out.println(loadDAO.selectByNameAndPassword("admin", "admin"));
        MybatisUtil.close();
    }

    //根据用户名查询
    @Test
    public void selectByName() {
        System.out.println(loadDAO.selectByName("admin"));
        MybatisUtil.close();
    }

    //新增信息
    @Test
    public void insertAll() {
        User user = new User("root", "root", new SimpleDateFormat().format(new Date()).toString(), "管理员");
        loadDAO.insertAll(user);
        MybatisUtil.commit();
        MybatisUtil.close();
    }
}