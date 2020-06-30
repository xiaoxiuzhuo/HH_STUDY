package basic;

public class BreakControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j;
		for (j = 1;j< i ; j++){
			if(j%5 == 0)
				break;
			System.out.println(j);
		}
	}

}
