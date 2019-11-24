package loopandbranch;

/**
 * Author:TurnLi
 * Description:循环和分支
 * CreateDate 18:22 2019/11/10
 * Modified by:
 */
public class LoopAndBranch {
    public static void main(String[] args) {
        //if-else   switch

        //简单的判断
        int i= 3;
        if (i>5){
            System.out.println("假的");
        }else{
            System.out.println("true");
        }
        //多次判断

        if(i>5){
            System.out.println("你好啊，你比五大");
        }else if(i>4){
            System.out.println("你好你比四大");
        }else{
            System.out.println("你真的很小啊");
        }
        //sitch变量可以放(byte,char,short,int,)和他们的包装类，枚举，String
        switch (i){
            case 1://if(i==1)
                System.out.println("你是1");
                break;
            case 3://else if(i==3)
                System.out.println("你是3");
                break;
            default://else
                System.out.println("I don't konw your name!");
                break;
        }

        //  for   while  do where
        //1.循环打印1-100
        int w1 = 1;
        while (w1 <= 100) {
            System.out.println(w1);
            w1++;
        }
        int w2 = 1;
        do {
            System.out.println(w2);
            w2++;
        } while (w2 <= 100);
        //1-100所有偶数的和
        int sum = 0;
        for (int f3 = 1; f3 < 100; f3++) {
            if (f3 % 2 == 0) {
                sum += f3;
            }
            f3++;
        }
        sum = 0;
        int w3 = 1;
        while (w3 < 100) {
            if (w3 % 2 == 0) {
                sum += w3;
            }
            w3++;
        }
        //3无限循环
//        for (; ; ) {
//            System.out.println("无限循环");
//        }
//        while(true){
//            System.out.println("无限循环");
//        }

        //4嵌套循环 循环之间的嵌套for-for;for-while;wwhile-while
        for (int f4 = 1; f4 < 5; f4++){
            for (int f5 = 1; f5 < 6; f5++) {
                System.out.println("里面的循环");
            }
        System.out.println("外面循环" + f4);
        }

        //乘法口诀表
        int w4 = 1;
        while (w4 <=9) {
            int w5 = 1;
            while (w5 <=9) {
                System.out.print(w5 + "*" + w4 + "=" + w4 * w5 + "|");
                if(w4==w5){
                    break;
                }else{
                    w5++;
                }
            }
            w4++;
            System.out.print("\n");
        }
        for(int f4 = 1;f4<=9;f4++){
            for(int f5=1;f5<=f4;f5++){
                System.out.print(f5 + "*" + f4 + "=" +f5*f4 + "|");
            }
            System.out.println();
        }
        //1-100质数
        for (int f6 =2;f6<=100;f6++){
            int count = 0;
            for(int f7=2;f7<f6;f7++){
                if (f6%f7==0){
                    count ++;
                    break;
                }
            }
            if (count==0) System.out.println(f6);
        }


        //对于以上的流程，有几个常用的关键词，break，continue,return
        //break,终止本层循环
        //continue,终止本次循环
        //return,结束这个方法。


    }
}
