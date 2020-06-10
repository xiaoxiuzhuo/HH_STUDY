package basic;
import java.util.Scanner;

public class Judgment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please input number of a1 :");
		int a1 = s.nextInt();
		System.out.println("Please input number of a2 :");
		int a2 = s.nextInt();
		if (a1 >= a2) {
			System.out.println("a1 >= a2");
		}
		else {
			System.out.println("a1 < a2");
		}
		s.close();
	}

}
