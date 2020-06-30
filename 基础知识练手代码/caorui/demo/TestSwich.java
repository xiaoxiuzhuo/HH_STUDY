package com.caorui.demo;

/**
 * swich语句使用的注意事项：
 *  1、case后的数值不可以重复
 *  2、swich后面的小括号当中只能是下列数据类型：
 *      基本数据类型：byte,int,short,char
 *      引用数据类型：String,enum
 *  3、case的前后顺序可以颠倒。
 *  4、break语句可以省略，
 *      但会从上一直向下执行，并且会从当前case的位置向下穿透，会打印下一个case的内容，直到遇到第一个break
 *      或者到整体结束为止。
 *
 */
public class TestSwich {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        switch (a-b){
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("no");
                break;

        }
    }
}
