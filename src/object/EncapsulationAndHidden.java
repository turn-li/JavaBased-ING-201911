package object;

/**
 * @Author:TurnLi
 * @Description:属性的封装和隐藏
 * @CreateDate 17:06 2019/11/12
 * @Modified by:
 */
public class EncapsulationAndHidden {

//    public int age；
    //如果直接对类内的属性进行操作，不安全，混乱。所以需要进行隐藏，封装
    private int age ;//将age隐藏起来，不能像protected,public一样被访问。

    //通过public的get,set 方法操作就是进行封装。
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<100 && age>0){
            this.age = age;
        }else{
            System.out.println("这个人在阴间呢");
        }
    }


}
