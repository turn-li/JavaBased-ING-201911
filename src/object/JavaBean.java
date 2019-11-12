package object;

/**
 * @Author:TurnLi
 * @Description:一种可以重用的组件
 * @CreateDate 19:19 2019/11/12
 * @Modified by:
 */
public class JavaBean {
    /**
     * 满足以下条件的都可以称之为javabean
     *一般叫做实体类
     * 1.类是公共的即：public class Name{}
     * 2.有一个无参的构造函数，一般在javabean中不写构造函数，使用默认的
     * 3.有属性，并且定义为private,;有get ,set方法。
     */
    //这里写一个person的javabean
    private String name;
    private int age;
    private int sex;

    //一般这这里是我们都使用开发工具自带的gererate,进行自动编译
    //有时我们使用数据库时，我们就使用工具把数据库的表都转换成javabean
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

}
