/*
注意事项：
1. 创建多个变量，变量之间的名称不可以重复
2. 对于float和long类型，后缀F和L不能丢掉
3. 注意左侧和右侧数值范围
4. 只有赋值的变量才能使用
5. 变量使用不能超过作用域范围
【作用域】：从定义变量的一行开始，一直到所属的大括号结束为止。
6. 可以通过一个语句创建多个变量，不推荐
*/
public class Test03VariableNotice{
	public static void main(String[] args){
		
		{
			int num1 = 60;
			System.out.println(num1);
		}
		//System.out.println(num1);//超出作用域了
		int a,b,c;//同时创建三个变量,分别赋值
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int a1 = 100,b1 = 200,c1 = 300;//同时创建三个变量,同时赋值
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
	}
}