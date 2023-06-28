package wangwei.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import wangwei.service.impl.ClazzDAOImpl;
import wangwei.service.impl.TagDAOImpl;
import wangwei.util.MybatisUtil;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ClazzController extends ActionSupport {
    private int id;
    private File upload;
    //文件上传路径
    private String path;
    //获取文件上传原始名
    private String uploadFileName;
    private String name;
    private int tag_id;
    private String fileName;
    ClazzDAOImpl clazzDAO = new ClazzDAOImpl();
    TagDAOImpl tagDAO = new TagDAOImpl();
    HttpServletRequest request = ServletActionContext.getRequest();

    //查询所有班级信息
    public String getAll() {
        request.setAttribute("all", clazzDAO.findAll());
        MybatisUtil.close();
        return "success";
    }

    //删除班级
    public String deleteAll() {
        clazzDAO.deleteAll(id);
        MybatisUtil.close();
        return "success";
    }

    //查询所有班级标签
    public String findAllTag() {
        request.setAttribute("allTag", tagDAO.findByClazz());
        MybatisUtil.close();
        return "success";
    }

//    //添加班级
    public String addClazz() throws IOException {
        String realPath = ServletActionContext.getRequest().getSession().getServletContext().getRealPath(path);
        System.out.println("realPath="+realPath);
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String newFileName = uuid + "_" + uploadFileName;  // 设置上传文件的文件名，这里使用 UUID 作为前缀
        FileUtils.copyFile(upload, new File(realPath, newFileName));
        clazzDAO.insertAll(name, newFileName, tag_id);  // 将新的文件名传递给 DAO 方法
        MybatisUtil.close();
        return "success";
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
