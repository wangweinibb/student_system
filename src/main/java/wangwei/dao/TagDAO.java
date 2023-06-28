package wangwei.dao;

import org.apache.ibatis.annotations.Param;
import wangwei.entity.Tag;

import java.util.List;

public interface TagDAO {
    //查询所有
    public List<Tag> selectAll();
    //添加标签
    public void insertTag(@Param(value = "name") String name, @Param(value = "type") String type,@Param(value = "createDate") String createDate);
    //删除标签
    public void deleteTag(@Param(value = "id") int id);
    //查询所有班级标签
    public List<Tag> selectByClazz();
    //查询所有学生标签
    public List<Tag> selectByStudent();
}
