package wangwei.entity;

public class Student {
    private int id;
    private String name;
    private int age;
    private String qq;
    private String phone;
    private String bir;
    private String starts;
    private String attr;
    private String mark;
    private int clazz_id;
    private int group_id;
    private int city_id;
    private int count;
    private Clazz clazz;
    private Group group;
    private City city;
    private Tag tag;

    public Student() {
    }

    public Student(int id, String name, int age, String qq, String phone, String bir, String starts, String attr, String mark, int clazz_id, int group_id, int city_id, int count, Clazz clazz, Group group, City city, Tag tag) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.qq = qq;
        this.phone = phone;
        this.bir = bir;
        this.starts = starts;
        this.attr = attr;
        this.mark = mark;
        this.clazz_id = clazz_id;
        this.group_id = group_id;
        this.city_id = city_id;
        this.count = count;
        this.clazz = clazz;
        this.group = group;
        this.city = city;
        this.tag = tag;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(int clazz_id) {
        this.clazz_id = clazz_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", bir='" + bir + '\'' +
                ", starts='" + starts + '\'' +
                ", attr='" + attr + '\'' +
                ", mark='" + mark + '\'' +
                ", clazz_id=" + clazz_id +
                ", group_id=" + group_id +
                ", city_id=" + city_id +
                ", count=" + count +
                ", clazz=" + clazz +
                ", group=" + group +
                ", city=" + city +
                ", tag=" + tag +
                '}';
    }
}
