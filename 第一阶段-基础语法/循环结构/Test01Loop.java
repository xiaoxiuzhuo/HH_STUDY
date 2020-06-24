public class Test01Loop{
	
	public static void main(String[] args){
		forMethod();
		whileMethod();
		doWhileMethod();
		breakMethod();
		continueMethod();
	}
	
	//for—≠ª∑
	public static void forMethod()
	{
		for(int i = 1;i <= 10;i++){
			System.out.println("forŒ“¥Ì¿≤£°"+i);
		}
		System.out.println("for—≠ª∑Õ£÷π");
	}
	
	//while—≠ª∑
	public static void whileMethod()
	{
		int i = 1;
		while(i<=10){
			System.out.println("whileŒ“¥Ì¿≤£°"+i);
			i++;
		}
		System.out.println("while—≠ª∑Õ£÷π");
	}
	
	//dowhile—≠ª∑
	public static void doWhileMethod()
	{
		int i = 1;
		do{
			System.out.println("dowhileŒ“¥Ì¿≤£°"+i);
			i++;
		}while(i<=10);
		System.out.println("dowhile—≠ª∑Õ£÷π");
	}
	
	//break
	public static void breakMethod()
	{
		for(int i = 1;i <= 10;i++){
			if(i == 4){
				break;
			}
			System.out.println("breakŒ“¥Ì¿≤£°"+i);
		}
		System.out.println("break—≠ª∑Õ£÷π");
	}
	
	//continue
	public static void continueMethod()
	{
		for(int i = 1;i <= 10;i++){
			if(i == 4){
				continue;
			}
			System.out.println("continueŒ“¥Ì¿≤£°"+i);
		}
		System.out.println("continue—≠ª∑Õ£÷π");
	}
}
