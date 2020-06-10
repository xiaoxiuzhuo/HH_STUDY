package basic;

public class LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(i++ == 1 && ++j == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);
		
		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		//此处++i == 1 为false，j++不再计算。
		System.out.println(++i == 1 && j++ == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);

		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(i++ == 1 & ++j == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);
		
		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(++i == 1 & j++ == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);
	
		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(++i == 1 | j++ == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);

		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(i++ == 1 | ++j == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);

		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(++i == 1 || j++ == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);

		i = 1;
		j = 1;
		System.out.println("i = " + i + "\n" + "j = " + j);
		System.out.println(i++ == 1 || ++j == 1);
		System.out.println("i = " + i + "\n" + "j = " + j);

		boolean a = true;
		boolean b = false;
		System.out.println(a^b);
		System.out.println(a^!b);
		
	}

}
