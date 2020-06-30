package basic;

public class MathProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a+b=8; a+c=14; b+d=10; c-d=6
		int a = 0,b = 0,c = 0,d = 0;
		for(a=0;a<14;a++)
			for(b=0;b<8;b++)
				for(c=6;c<14;c++)
					for(d=0;d<10;d++)
						if(a+b==8 & a+c==14 & b+d==10 & c-d==6){
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							System.out.println(d);
						}
							
	}

}
