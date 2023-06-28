import org.junit.Test;
import wangwei.dao.TagDAO;
import wangwei.service.impl.TagDAOImpl;
import wangwei.util.MybatisUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tag {
    TagDAO tagDAO = (TagDAO) MybatisUtil.getMapper(TagDAO.class);
    TagDAOImpl tagDAO1 = new TagDAOImpl();

    //查询所有标签
    @Test
    public void selectAll() {
        System.out.println(tagDAO.selectAll());
    }

    @Test
    public void findAll() {
        System.out.println(tagDAO1.findAll());
    }
    //添加标签
    @Test
    public void insertAll(){
        tagDAO1.addTag("导管","学生",new SimpleDateFormat().format(new Date()));
    }
    //删除标签
    @Test
    public void deleteAll(){
        tagDAO1.deleteTag(1);
    }
    //查询所有班级标签
    @Test
    public void findByClazz(){
        System.out.println(tagDAO1.findByClazz());
    }
    //查询所有学生标签
    @Test
    public void findByStudent(){
        System.out.println(tagDAO1.findByStudent());
    }
}
