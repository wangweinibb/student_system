package wangwei.dao;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.City;
import wangwei.entity.Group;

import java.util.List;

public interface CityDAO {
    //查询所有
    public List<City> selectAll();
    //查询所有城市名字
    public List<City> selectCityName();
    //删除城市
    public void deleteById(@Param(value = "id") int id);
    //添加城市
    public void insertCity(@Param(value = "name") String name);
}
