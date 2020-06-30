package basic;

import java.util.Scanner;

public class LeapYear {

	int year;
	
	boolean JudgeLeap(int i){
		if(i%400 == 0)
			return true;
		else if (i%4 == 0 & i%100 != 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LeapYear l = new LeapYear();
		System.out.println("请输入年份：");
		l.year = s.nextInt();
		if (l.JudgeLeap(l.year)) 
			System.out.println(l.year + "是闰年");
		else
			System.out.println(l.year + "不是闰年");
		s.close();
	}

}
