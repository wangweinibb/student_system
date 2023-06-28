package wangwei.dao;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.Clazz;
import wangwei.entity.Group;
import java.util.List;

public interface GroupDAO {
    //查询所有
    public List<Group> selectAll();
    //查询小组有关学生信息
    public List<Group> selectGroupMessage();
    //删除小组
    public void deleteAll(@Param(value = "id") int id);
//    添加小组
    public void insertGroup(@Param(value = "group_name") String group_name,@Param(value = "clazz_id") int clazz_id,@Param(value = "createDate") String createDate);
}
