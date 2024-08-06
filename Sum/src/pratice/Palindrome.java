
package pratice;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[]args) {
		int n,a,i=0,j=0;
		Scanner an = new Scanner(System.in);
		System.out.println("enter a number");
		n = an.nextInt();
		a=n;
		while (a>0 ){
			i = a%10;
			j = (j*10)+i;
			a = a/10;
			
		}
		if (n==j) {
			System.out.println("it is a palindrome");
		
		}else {
			System.out.println("not a palindrome");
		}
	}

}
