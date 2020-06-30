package basic;

import java.util.Scanner;

public class ForControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//di = daily income 
		int di = 1;
		//n = all income;
		int n = 0;
		//d = day;
		int d;
		Scanner s = new Scanner(System.in);
		System.out.println("请输入乞丐干了多少天！");
		d = s.nextInt();
		for (int j = 1; j <= d; j++){
			n += di;
			System.out.println("第"+j +"天收入了"+di+"块钱！");
			di *= 2;
		}
		System.out.println("共收入"+ n +"块钱");
		s.close();
	}

}
