import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		float g = (float)a / b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(b%a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		 
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		System.out.println("第一个输入为：" + a1);
		System.out.println("第二个输入为：" + a2);
		
		System.out.println("请输入体重：");
		float weight = s.nextFloat();
		System.out.println("请输入身高：");
		float height = s.nextFloat();
		Operator man = new Operator();
		System.out.println(man.calculateBMI(weight,height));
	}

	float calculateBMI(float weight, float height){
		return weight / (height * height);
	}
}
