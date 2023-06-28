package wangwei.entity;

import java.util.List;

public class Clazz {
    private int id;
    private String name;
    private String path;
    private int tag_id;
    private List<Group> groups;
    private List<Student> students;
    private Tag tags;

    public Clazz() {
    }

    public Clazz(int id, String name, String path, int tag_id) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.tag_id = tag_id;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Tag getTags() {
        return tags;
    }

    public void setTags(Tag tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", tag_id=" + tag_id +
                ", groups=" + groups +
                ", students=" + students +
                ", tags=" + tags +
                '}';
    }
}
