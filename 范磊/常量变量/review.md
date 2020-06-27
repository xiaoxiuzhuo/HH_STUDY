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
* String类
  String 字符串常量，长度不可变
  StringBuffer 字符串变量（线程安全），长度可变
  StringBuilder 字符串变量（非线程安全），长度可变
  常见操作方法：append、insert、reverse方法
* Char类与Character包装类
  常见方法：toCharArray()，valueOf()
## 6.哈希
* HashMap 与HashTable
方法：put()添加  putAll(整个hash表)   remove()   containKey()判断key  containValue()判断value  contains(属于hashtable)  get()基于key查询value    values()获取所有value     keyset() 获取所有key

* 都是继承Map接口;
  区别：
  Hashmap：非同步，非线程安全；允许null键值，效率更高。
  Hashtable: 同步，线程安全；不允许null.

  构建方式
  ***hashmap    
  HashMap<String, String> map = new HashMap<String, String>();    
  map.put("key1", "value1");    
  map.put("key2", "value2");    
  map.put("key3", "value3"); 

  ***hashtable
  HashTable<String, String> map = new HashTable<String, String>();    
  map.put("key1", "value1");    
  map.put("key2", "value2");    
  map.put("key3", "value3"); 
* 遍历方式

   （1）hash通用遍历  
  （hashmap 与hashtable 一样）  二次取值  keyset() 方法 keyset()返回是Map中key值的集合

  HashMap<String,String> mp = new　HashMap<String,String>();
  for (String i : mp.keySet()) // foreach的表达方式
  { 
 	  //String 是mp中的键的对应类型 i 是对应的KeySet中的每一个key值 　
   	  System.out.println( mp.get(i));　
  }

  （2）entrySet() 方法   
  返回值也是返回一个Set集合，此集合的类型为Map.Entry；再利用 for循环获取
  Set集合中的每一个Entry实例，Map.Entry接口为泛型，定义为Entry<K,V>。它表示Map中的一个实体（一个key-value对）.
  HashMap<String,String> mp = new　HashMap<String,String>();
  for (Map.Entry<String, String> entry : map.entrySet()) {    
  System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
  	}  

## 7.类与对象
* 引用：实例化声明   类 实例名=new 类（）；
    
     
        

