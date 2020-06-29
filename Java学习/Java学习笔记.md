# Java学习

## 基础

### 类和对象

1. this可以在一个构造方法中调用另一个构造方法

```java
public Hero(String name){
        this.name = name;
    }
public Hero(String name,float hp){
        this(name);
        this.hp = hp;
    }
```

2. 传参：基本类型传参、类类型传参

   - 基本类型传参：在函数内，无法修改函数外的基本类型参数

   - =对于基本类型是赋值，=对于类类型是引用

3. 包

4. 访问修饰符

   public、protected、默认（package、friendly、default）、private

   ![总结](https://stepimagewm.how2j.cn/612.png)

   作用范围最小原则

   - 属性通常使用private封装起来
   - 方法一般使用public用于被调用
   - 会被子类继承的方法，通常使用protected

5. 类属性

   static修饰的属性为类属性（静态属性），所有对象共享一个值。

   static String propertyName;

6. 类方法

   **类方法：** 又叫做静态方法

   **对象方法：** 又叫实例方法，非静态方法

   - 访问一个对象方法，必须**建立在有一个对象**的前提的基础上
   - 访问类方法，**不需要对象**的存在，直接就访问  

7. 属性初始化

   - 对象属性初始化

     - 声明对象时初始化
     - 构造方法中初始化
     - 初始化块

   - 类属性初始化

     - 声明类时初始化

       ```
       public static int itemCapacity=8;
       ```

       

     - 静态初始化块

       ```
       public static int itemCapacity;
       static{
               itemCapacity = 6;
           }
       ```

类中对象属性初始化方法执行先后顺序：声明初始化、初始化块初始化、构造函数初始化

8. 枚举，也是类

```java
public enum HeroType{
    TANK,WARRIOR,ASSASSIN,RANGED,ABLITYPOWER,SUPPORT
}
```

### 接口和继承

1. 接口、实现

   implements 

   接口定义了规范，而接口的实现类按照这样的规范去实现。
   一个接口可以有多个实现类，这样就体现了java的多态。