package basic;

public class ContinueC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		for (int i = 1;i < n ;i++){
			if(i%3 == 0 || i%5 ==0)
				continue;
			System.out.println(i);
		}	
	}

}
