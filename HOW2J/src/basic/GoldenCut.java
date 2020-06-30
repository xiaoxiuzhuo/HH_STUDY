package basic;

public class GoldenCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numerator n and denominator d
		int n,d;
		//storage numerator and denominator
		int sn = 0,sd = 0;
		double gc = 0.618;
		//difference between golden cut and number
		double dg = 1.0,eg;
		for(d = 1 ; d < 21 ; d++){
			for(n=1; n<d ; n++){
				if(d%2 == 0 && n%2 == 0)
					continue;
				else{
					eg = ((double)n/d - gc) * ((double)n/d - gc);
					if(eg<dg){
						sn = n;
						sd = d;
						dg = eg;
					}
				}
			}
		}
		System.out.println(sn);
		System.out.println(sd);
	}

}
