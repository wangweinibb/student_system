package wangwei.service.impl;

import wangwei.dao.CityDAO;
import wangwei.entity.City;
import wangwei.service.CityDAOService;
import wangwei.util.MybatisUtil;

import java.util.List;

public class CityDAOImpl implements CityDAOService {
    CityDAO cityDAO = (CityDAO) MybatisUtil.getMapper(CityDAO.class);

    @Override
    public List<City> findAll() {
        return cityDAO.selectAll();
    }

    @Override
    public List<City> findCityName() {
        return cityDAO.selectCityName();
    }

    @Override
    public void deleteById(int id) {
        cityDAO.deleteById(id);
        MybatisUtil.commit();
    }

    @Override
    public void addCity(String name) {
        cityDAO.insertCity(name);
        MybatisUtil.commit();
    }
}
