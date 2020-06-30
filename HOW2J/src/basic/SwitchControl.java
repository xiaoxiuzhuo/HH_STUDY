package basic;

import java.util.Scanner;

public class SwitchControl {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int month;
		System.out.println("请输入月份：");
		month = s.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("春天！");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("夏天！");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("秋天！");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬天！");
			break;
		default:
			System.out.println("What the matter with you ?");
			break;
		}
		s.close();
	}
}
