package basic;

public class Millionaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//month income = mi;year income = yi;
		int mi;
		int yi;
		//all income = ai
		double ai;
		//year rate of interest 
		double ri;
		//initialize
		mi = 1000;
		ai = 0;
		ri = 0.2;
		yi = mi * 12;
		for(int j = 1;;j++){
			if(ai>1000000){
				System.out.println("第" + j + "年你就存到了100万！");
				break;
			}
			ai = ai * 1.2;
			ai += yi * (1+ri);
			System.out.println("j=" + j + "\t" + "ai= " + ai);
		}
	}

}
