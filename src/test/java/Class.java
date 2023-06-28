import org.junit.Test;
import wangwei.dao.ClazzDAO;
import wangwei.service.impl.ClazzDAOImpl;
import wangwei.util.MybatisUtil;

public class Class {
    ClazzDAO classDAO = (ClazzDAO) MybatisUtil.getMapper(ClazzDAO.class);
    ClazzDAOImpl clazzDAO1=new ClazzDAOImpl();
    //查询所有班级
    @Test
    public void selectAll(){
        System.out.println(classDAO.selectAll());
    }
    @Test
    public void findAll(){
        System.out.println(clazzDAO1.findAll());
    }
    //删除班级
    @Test
    public void deleteClazz(){
        clazzDAO1.deleteAll(1);
    }
    //添加班级
    @Test
    public void insertAll(){
        clazzDAO1.insertAll("21软件","sb.jpg",25);
    }
}
