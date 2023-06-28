import org.junit.Test;
import wangwei.dao.GroupDAO;
import wangwei.service.impl.GroupDAOImpl;
import wangwei.util.MybatisUtil;

public class Group {
    GroupDAO groupDAO = (GroupDAO) MybatisUtil.getMapper(GroupDAO.class);
    GroupDAOImpl groupDAO1=new GroupDAOImpl();
    //查询所有
    @Test
    public void selectAll(){
        System.out.println(groupDAO.selectAll());
    }
    //查询所有小组有关学生信息
    @Test
    public void selectGroupMessage(){
        System.out.println(groupDAO.selectGroupMessage());
    }
    @Test
    public void findGroupMessage(){
        System.out.println(groupDAO1.fingGroupMessage());
    }
    //删除小组
    @Test
    public void deleteAll(){
        groupDAO1.removeAll(1);
    }
//    添加小组
    @Test
    public void addGroup(){
        groupDAO1.addGroup("导管",31,"2023-6-19");
    }
}
