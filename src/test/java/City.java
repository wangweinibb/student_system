import org.junit.Test;
import wangwei.dao.CityDAO;
import wangwei.service.CityDAOService;
import wangwei.service.impl.CityDAOImpl;
import wangwei.util.MybatisUtil;

public class City {
    CityDAO cityDAO = (CityDAO) MybatisUtil.getMapper(CityDAO.class);
    CityDAOImpl cityDAO1=new CityDAOImpl();
    //查询所有城市
    @Test
    public void selectAll(){
        System.out.println(cityDAO.selectAll());
    }
    @Test
    public void findAll(){
        System.out.println(cityDAO1.findAll());
    }
    //查询所有城市名字
    @Test
    public void selectCityName(){
        System.out.println(cityDAO.selectCityName());
    }
    @Test
    public void findCityName(){
        System.out.println(cityDAO1.findCityName());
    }
    //删除城市
    @Test
    public void deleteById(){
        cityDAO1.deleteById(15);
    }
    //添加城市
    @Test
    public void addCity(){
        cityDAO1.addCity("北京");
    }
}
