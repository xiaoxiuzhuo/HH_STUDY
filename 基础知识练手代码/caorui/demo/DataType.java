package com.caorui.demo;
/*
（byte,char,chort）类型相加，会先自动转换为int类型，再进行相加，因此相加的结果为int类型
 */
public class DataType {
    public static void main(String[] args) {
        byte num1=20;
        byte num2=20;
        byte num3= (byte) (num1+num2);//num1+num2是byte相加，会先自动转为int类型，所以得到的结果为int类型。
        System.out.println(num3);
        
    }
}
