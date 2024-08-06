package pratice;

import java.util.Scanner;

public class Evenoddnumber {
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in) ;
		System.out.println("enter the number");
		int n = e.nextInt();
		if(n%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

}
