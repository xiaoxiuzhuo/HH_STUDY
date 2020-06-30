package basic;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double weight;
		double bmi;
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入体重：");
		weight = s.nextDouble();
		System.out.println("请输入身高：");
		height = s.nextDouble();
		bmi = weight/(height * height);
		System.out.println(bmi);
		/*
		if (bmi < 18.5) 
			System.out.println("体重过轻！");
		else if (bmi>=18.5 && bmi<24)
			System.out.println("正常范围！");
		else if (bmi>=24 && bmi<27)
			System.out.println("体重过重！");
		else if (bmi>=27 && bmi<30)
			System.out.println("轻度肥胖！");
		else if (bmi>30 && bmi<35)
			System.out.println("中度肥胖！");
		else
			System.out.println("重度肥胖！");
		*/

		s.close();
	}

}
