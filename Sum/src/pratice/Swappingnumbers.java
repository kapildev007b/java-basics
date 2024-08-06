package pratice;
import java .util.Scanner;
public class Swappingnumbers {
	public static void main(String[]args) {
		int a,b;
		Scanner e = new Scanner(System.in);
		 System.out.println("enter the number");
		a= e .nextInt();
		b= e .nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping numbers");
		System.out.println(a);
		System.out.println(b);
		
	}
	

}
