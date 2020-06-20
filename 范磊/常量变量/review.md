# 快速复习  入职学习基础部分
## 1.基本变量类型 * 8类 
* 整型：byte short int long 
* 浮点：float double 
* 字符：char 
* 布尔：Boolean
**数据类型转换规则：小转大自动，大转小强制转（精度）**
**作用域：成员变量（类变量）、局部变量**
## 2.面向对象/面向过程
* 面向对象：将解决问题的各事物分解为相应的object,用于描述其解决问题的行为和属性。采用封装（private）、继承（extend）、抽象（abstract）等设计实现
* 面向过程：将问题分解为各个步骤，分别构建函数依次解决

## 3.操作符
* 三元操作符：修饰符 变量=变量A **关系操作符** 变量B ？ 变量A：变量B
* 位操作符：二进制操作方式    **#######** 二进制转换方法：变量类型.TobinaryString(i)
* Scanner类：熟悉其操作方法
  **Scanner input = new Scanner(System.in);**
  **input.nextint() //其他数据类型**

## 4.条件判断
* if语句
* switch语句
* while语句
* 关键字：continue  AND break  **注意其外环跳转和外环退出使用方式**
* **PS**: 注意循环语句 for 与foreach的用法

## 5.数组
* 创建方式：
    **(1)** int[] a;    a = new int[5];
    **(2)** int[] b = new int[5];
    **(3)** int[][] array; 多维数组
* 操作方式
  初始化：int[] a={，，，};   int[] a= new int[5]{,,,,};  int[] a= new int[]{,,,,};
  索引：array[index]；
  排序：Arrays类方法掌握;Collections类方法掌握;
  拷贝：System.arraycopy()   **注意：Arraylist 扩容原理**

## 6.类与对象

    
     
        

