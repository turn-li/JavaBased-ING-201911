package object;

/**
 * @Author:TurnLi
 * @Description:继承，java特性之一
 * java只支持单继承extends 单个，相对于就有了implements 多个接口（interface），可以多实现。
 * @CreateDate 10:19 2019/11/13
 * @Modified by:
 */
//写一个父类
class Animal{
    String name;
    int age;
    char sex;

    void eat() {
        System.out.println("animal : eat");
    }
}

class Dog extends Animal {//类之间实现继承，就能实现多态，后面纤细讲


    //子类不能访问父类的private,只能通过get set 方法。
    //子类是对父类的扩展
    @Override
    /*
    *方法重写需要注意的：
    * 1.重写就是重写方法体
    * 2、子类权限访问>=父类访问权限
    * 3.同时为static，或非static
    * 4.异常<=父类异常
    * 5.重写是对父类方法的覆盖，重载时多个同名方法
     */
    void eat() {
        System.out.println("Dog : eat");
    }


    void eatTest() {
        this.eat();//当前dog类的eat
        super.eat();//父类animal的eat
    }

}

public class Inheritable {
    public static void main(String[] args) {
        Animal animal = new Animal();//对象就是实例
        animal.eat();
        //可以看做是实例animal存储在栈stack中 ,对象 new Animal()存储在堆内存heap中   ,类 Animal()
        //animal指向构造出的对象，所以说实例就是对象
        
        //这个是的多态性，通过传递给父类对象引用不同的子类从而变现出不同行为。
        Animal a = new Dog();
        a.eat();

        //子类new对象是就是调用构造器，并且默认调用父类的无参构造器。如果父类没有无参的则在构造其中写明super(参数);
        Dog dog = new Dog();
        dog.eat();
        dog.eatTest();

    }
}
