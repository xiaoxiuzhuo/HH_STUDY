package com.caorui.demo;

/**
 * 一个int类型的变量可以使用 变量++ ；那么double类型呢？char类型呢？
 *   ++不能用于String,boolean,
 */
public class TestDoubleJia {
    public static void main(String[] args) {
        double num1=3.12;
        num1++;
        System.out.println(num1);

        char char1='a';
        char1++;
        System.out.println(char1);

        //String s1="ad";
        //s1++;
        //System.out.println(s1);
        //++不能用于String类

        //boolean b=true;
        //b++;//++不能用于boolean

    }
}
