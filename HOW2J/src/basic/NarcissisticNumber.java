package basic;

public class NarcissisticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0 , c = 0;
		int j;
		int i;
		for(i = 100; i< 1000; i++){
			j = i;
			c = i%10;
			b = i/10 %10;
			a = i/10/10 %10;
			if(j == (a*a*a + b*b*b + c*c*c))
				System.out.println(j);
		}

	}

}
