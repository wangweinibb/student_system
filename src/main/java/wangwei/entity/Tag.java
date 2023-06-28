package wangwei.entity;

public class Tag {
    private int id;
    private String name;
    private String type;
    private String createDate;
    private Clazz clazzs;

    public Tag() {
    }

    public Tag(int id, String name, String type, String createDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.createDate = createDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Clazz getClazzs() {
        return clazzs;
    }

    public void setClazzs(Clazz clazzs) {
        this.clazzs = clazzs;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", createDate='" + createDate + '\'' +
                ", clazzs=" + clazzs +
                '}';
    }
}
