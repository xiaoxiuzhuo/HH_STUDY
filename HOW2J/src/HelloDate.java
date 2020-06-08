import java.util.*;

public class HelloDate{	
	final int i = 10;
	
	public void method1(final int i){
		System.out.println(i);
	}
	
	public static void main(String[] args){
		HelloDate h = new HelloDate();
		h.method1(1);
		h.method1(2);
	}
}