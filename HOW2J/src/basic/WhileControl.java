package basic;

import java.util.Scanner;

public class WhileControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i;
		int n=1;
		i = s.nextInt();
		if (i>0) {
			while (i>0){
				n *=i;
				i--;
			}
			System.out.println(n);
		}
		else
			System.out.println("what the matter with you ?");	
		s.close();
	}

}
