/*
变量：在程序运行期间，内容可以发生改变的量

创建一个变量并且使用的格式：

数据类型 变量名称；//创建了一个变量
变量名称 = 数据值；//赋值

一步到位的格式：

数据类型 变量名称 = 数据值；//创建并赋值
*/
public class Test02Variable{
	public static void main(String[] args){
		//第一种创建变量并赋值
		int num1;
		num1 = 10;
		System.out.println(num1);
	    //打印变量名称时，会显示其内容
		
		//改变变量中本来的数字，变成新的
		num1 = 20;
		System.out.println(num1);
		
		//第二种创建变量并赋值
		int num2 = 26;
		System.out.println(num2);
		
		System.out.println("================");
		byte num3;//-128-127
		num3 = 30;//注意右侧数值的范围不能超过左边的额数值范围
		System.out.println(num3);
		
		short num5 = 50;
		System.out.println(num5);
		
		long num6 = 300000000L;
		System.out.println(num6);
		
		float num7 = 2.5F;
		System.out.println(num7);
		
		double num8 = 3.14;
		System.out.println(num8);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		zifu1 = '中';//字符变量可以写一个中国字
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
		boolean var2;
		var2 = var1;//右侧已存在，将true值向左交给var2进行存储
		System.out.println(var2);
	}
}