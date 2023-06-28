package wangwei.service;

import wangwei.entity.City;

import java.util.List;

public interface CityDAOService {
    //查询所有
    public List<City> findAll();
    //查询所有城市名字
    public List<City> findCityName();
    //删除城市
    public void deleteById(int id);
    //添加城市
    public void addCity(String name);
}
