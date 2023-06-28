package wangwei.dao;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.Clazz;
import wangwei.entity.Tag;

import java.util.List;

public interface ClazzDAO {
    //查询所有
    public List<Clazz> selectAll();
    //删除班级
    public void deleteAll(@Param(value = "id") int id);
    //添加班级
    public void insertAll(@Param(value = "name") String name,@Param(value = "path") String path,@Param(value = "tag_id") int tag_id);

}
