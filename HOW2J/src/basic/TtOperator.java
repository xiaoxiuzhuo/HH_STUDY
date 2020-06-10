package basic;

import java.util.Scanner;

public class TtOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		if (i < 8 & i > 0) {
			System.out.println(i<6 ? "工作日" : "周末");
		}
		else {
			System.out.println("错误的输入！");
		}
		s.close();
	}

}
