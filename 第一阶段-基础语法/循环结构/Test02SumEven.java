/*
求出1-100之间的偶数和
*/
public class Test02SumEven{
	public static void main(String[] args){
		int evensum = 0;
		for(int i=1;i<=100;i++){
			if((i % 2) == 0){
				evensum = evensum+i;
			}
		}
		System.out.println(evensum);
		
		int j  = 1;
		int sum = 0;
		while(j <= 100){
			if((j % 2) == 0){
				sum = sum+j;
			}
			j++;
		}
		System.out.println(sum);
	}
}