package object;

/**
 * @Author:TurnLi
 * @Description:类构造方法和重载
 * @CreateDate 17:36 2019/11/12
 * @Modified by:
 */
public class ClassConstruct{

    private int age;
    private  String name;

    //当一个类new后，就是调用构造方法,如果没有写构造方法，系统会自动生成一个。

    /**
     * //这个就是默认的无参构造方法。
     */
     public ClassConstruct(){
    }

    //写构造方法时，需要注意三点1.没有类型，2.方法名必须和类名相同，3.参数不能一样

    public ClassConstruct(int age){
        //这里面使用了this的三种用法
         this();//调用当前类的构造方法，这个需要注意1：必须放在首行写，2:至少保证有一个构造器不调用this
         this.age = age;//给当前类的age赋值，主要是用来区分属性和形参的同名问题
         this.setAge(age);//调用当前类的方法，增强了可读性

        //这里用到了this的关键字，在new对象是就创建的指向对象引用,指的是当前对象。

    }


    protected ClassConstruct(int age,String name){

         this.age = age;
         this.name = name;
    }

    private ClassConstruct(String name){//这个定义出来，只能自己用，意义不大，不能用来实例化对象

    }
    //等等各种写法，写到这里就需要讲下构造的重载。实际上他和方法的重载是一样的。实际上他和方法是一样的，
    //只是比较特殊而已
    public void setAge(int age){
         this.age = age;
    }

}
