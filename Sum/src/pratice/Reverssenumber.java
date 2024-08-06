package pratice;
import java .util.Scanner;
public class Reverssenumber {
	public static void main(String[]args) {
		Scanner e = new Scanner(System.in);
		int n = e.nextInt();
		int a,b=0,c=0;
	a= n;
	while(a>0) {
		b=a%10;
		c = (c*10)+b;
		a = a/10;
		
			
		}System.out.println("reverse the number="+c);
	}
		
	}
