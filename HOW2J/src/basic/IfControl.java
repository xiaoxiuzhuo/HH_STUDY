package basic;

import java.util.Scanner;

public class IfControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		if(i == 1)
			System.out.println("i=1");
		System.out.println("if i == 1 is already running!");
		if(i == 2)
			System.out.println("i=2");
		System.out.println("if i == 2 is already running!");
		if(i == 3)
			System.out.println("i=3");
		System.out.println("if i == 3 is already running!");
		if(i == 4)
			System.out.println("i=4");
		System.out.println("if i == 4 is already running!");

		if(i == 1)
			System.out.println("i == 1");
		else if(i == 2)
			System.out.println("i == 2");
		else if (i == 3)
			System.out.println("i == 3");
		else if(i == 4)
			System.out.println("i == 4");
	
		s.close();
	}	
}
