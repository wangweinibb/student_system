package wangwei.entity;

import java.util.List;

public class Group {
    private int id;
    private String name;
    private String createDate;
    private int clazz_id;
    private Clazz clazzs;
    private List<Clazz> clazzes;
    private Student students;
    private Tag tags;

    public Group() {
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(int clazz_id) {
        this.clazz_id = clazz_id;
    }

    public Clazz getClazzs() {
        return clazzs;
    }

    public void setClazzs(Clazz clazzs) {
        this.clazzs = clazzs;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Tag getTags() {
        return tags;
    }

    public void setTags(Tag tags) {
        this.tags = tags;
    }

    public List<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(List<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", clazz_id=" + clazz_id +
                ", clazzs=" + clazzs +
                ", clazzes=" + clazzes +
                ", students=" + students +
                ", tags=" + tags +
                '}';
    }
}
