package object;

/**
 * @Author:TurnLi
 * @Description:一个简单的类,文字描述过多以后会改正d的
 * @CreateDate 15:02 2019/11/11
 * @Modified by:
 */
public class ObjectPerson {//命名为首字母大写

    //1.属性，成员变量，。
    /**
     * 修饰词
     * public   公共修饰词，都可以访问或调用
     * protected   只有当前类或子类可以调用
     * private  只有当前类可以使用
     */
    /**
     * 类成员变量（类中都可以访问）：实例变量(只有在对象实例化（存在实例的堆内存中）才能用），类变量(static修饰的）在实例对象是，先对静态修饰的加载进去
     * 局部变量（在栈内存中，作用范围结束后消除）：形参变量（传入的参数），方法局部变量（方法内的,不能初始化），代码块局部变量（{ int i = 10；}）
     */
    //语法格式  修饰符（public,protected,private) + 类型(基础数据类型或各种累）
    // +  属性名（命名规则第二个词首字母大写） = 初始值（可以声明不初始化，有默认值的）
    public String sex;
    protected String name;  //default null
    private int age;       //default 0

    static {
        int i = 10;
        System.out.println(i);
    }
    //2.行为，方法，
    //2.1类内的方法可以直接调用，不用实例化
    //一个类内多个同名的方法同时存在，必须参数或者返回值不一样。和构造函数类似、
    //如果重载的化就出现一个问题，匹配顺序了，1，优先匹配合适的类型，2.如果没有进行转换char->int->long->float->double,对short,byte的转换不安全
    //    3.如果也没有装箱，找实现的接口，所有的父类object，在没有找数组。
    //2.2,参数的传递：可变参数的新方式get(int... args)"数据类型..."表示参数是0->多个 使用时和数组相同
    //get(int i,String... args)也是可以的，其他的都不对。
    //深入了解参数传递。对于基本数据类型的参数传递，不改变原来参数的数值。
    //对于引用参数，改变原来里面的数值。

    /**
     * 打印name
     */
    public void printName() {//方法名命名规则是从第二个开首字母大写
        System.out.println(name);


    }

    /**
     * 获取年龄
     *
     * @return
     */
    public int getAge() {
        return age;


    }

    //3.实例化  ，就是将抽象的对象，创建一个具体的对象。使用new+构造方法
    //当对象被创建时，会对各种成员变量进行自动初始化赋值，
//    public static void main(String[] args) {
    //如果只调用一次直接使用匿名调用   new ObjectPerson.printName();
    //类内static方法不能访问类内非static标识的变量
//        ObjectPerson person = new ObjectPerson();//这个构造方法是default的
//        person.sex  = "man";//
//        person.name = "haha";//但是在其他无关类中protectd,private 修饰的name,age不能设置。


//    }

    //以后更复杂的操作，都可以归于，操作属性，调用方法


    /**
     * 在这里有个基础知识：java文件现编译成class字节码文件。
     * 通过类加载器加载进jvm,分别把基础数据类型和对象地址存在栈中（stack)，
     * 堆heap中存放所有对象，方法去method存放所有的class和static变量
     */
}
