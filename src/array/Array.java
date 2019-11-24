package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:TurnLi
 * @Description:数组
 * @CreateDate 20:33 2019/11/10
 * @Modified by:
 */
public class Array {
    public static void main(String[] args) {
        //声明动态数组，会自动给一个初始值，数据为0，对象为null
        int[] i = new int[3];
        //静态数组；
        int[] i1 = {1, 2, 3};
        System.out.println(i1[1]);
        String[] str = new String[]{"a", "b", "c"};
        str[0] = "d";

        //这里说到数组，就想到遍历
        for (int c = 0; c < i.length; c++) {
            System.out.println(i[c]);
        }

        //数组的函数
        Arrays.sort(i1);//排序
        Arrays.toString(i1);//转换成字符串
        //...还有一些其他的
        //foreach 一般对数组(相当于for循环）和集合(使用迭代器遍历）遍历
        for (String s : str) {
            System.out.println(s);
        }

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object obj : list) {
            System.out.println(obj);
        }
        list.forEach(x -> System.out.println(x));//java8特性

        //以上的首饰一维数组
        //        //多维数组声明的几种
        int[][] arr = {{1}, {2}};
        int[][] arr2 = new int[2][2];//长度固定
        int[][] ar1 = new int[2][];//第二维长度不固定，默认值为空

        int[] x, y[];//特殊定义x是一维数组，y是二维数组
        //二维数组遍历或者多维数组
        for (int[] i2 : arr) {
            for (int i3 : i2) {
                System.out.println(i3);
            }
        }
        //数组的常见算法问题
        //1.求数组的最大值，最小值，总和，平均值
        int[] array = new int[]{1, 2, 5, 2, 7, 9};
        float SUM = 0.0F;
        int MAX = 0;
        int MIN = 100;
        int count = 0;
        for (int i2 : array) {
            if (MAX < i2) MAX = i2;
            if (MIN > i2) MIN = i2;
            SUM = +i2;
            count++;
        }
        System.out.println("最大值" + MAX + "最小值" + MIN + "总和" + SUM + "平均值" + SUM / count);
        //2.数组的复制(复制不是复值，因为数组的名字表示的首地址，所以相当于引用了）。反转
        int[] array2 = new int[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            array2[i2] = array[i2];
        }

        for (int i2 = array.length - 1; i2 >= 0; i2--) {
            System.out.println(array[i2]);
        }
        //3、数组元素排序，相当于对他进行两次的遍历比较
        int i4 = 0;
        //将相邻位置进行比较
        for (int i2 = 0; i2 < array.length - 1; i2++) {
            for (int i3 = 0; i3 < array.length - 1 - i2; i3++) {
                //正序和倒序，知识比较时赋值的问题
                if (array[i3] > array[i3 + 1]) {
                    i4 = array[i3];
                    array[i3] = array[i3 + 1];
                    array[i3 + 1] = i4;//中间多了一个中转量
                }
            }
        }

        //得到数组后遍历就行了
        //数组操作常见问题1.数组下标越界  ArrayIndexOutOfBoundsException
        // 2、空指针  NullPointException
        //对于数组在内存中的方式，arr[][]  arr存在stack中，heap中存放一个数组存放二维数组的地址，二维数组中存放数据
    }

}
