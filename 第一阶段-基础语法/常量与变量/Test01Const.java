/*
常量：在程序运行期间，固定不变的量

常量的分类：
1. 字符串常量：凡是双引号括起来的部分，叫做字符串常量。例如：“123”、“123”、“hello”
2. 整数常量：直接写上的数字，没有小数点。例如：100、200、-250、0
3. 浮点数常量：直接协商的数字，有小数点。例如：2.5、-3.12、0.0
4. 字符常量：凡是单引号括起来的单个字符。例如：‘A’、'b'、‘9’、‘读’
5. 布尔常量：true、false
6. 空常量：null，代表没有任何数据
*/
public class Test01Const{
	public static void main(String[] args){
		//字符串常量
		System.out.println("ABC");
		System.out.println("");//字符串两个双引号中间的内容为空
		System.out.println("xyz");
		
		//整数常量
		System.out.println(30);
		System.out.println(-500);
		
		//浮点数常量
		System.out.println(3.14);
		System.out.println(-2.5);
		
		//字符常量
		System.out.println('A');
		System.out.println('6');
		//System.out.println('');//两个单引号中间必须有一个字符
		//System.out.println('ABC');
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
		
		//空常量，不能用来打印输出
	}
}