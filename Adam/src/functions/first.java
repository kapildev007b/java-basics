package functions;

public class first {
	public static int addnumber(int a , int b){
		return a+b;
	}
	public static int subnumber(int a , int b) {
		return a-b;
	}
	public static int mulnumber(int a , int b) {
		return a*b;
	}
	public static int divnumber(int a , int b) {
		return a/b;
	}
	public static void main(String[]args) { 
		int num1  = 100;
		int num2 =  2;
		
		int sum = addnumber(num1,num2);
		System.out.println(sum);
		
		int sum1 = subnumber(num1,num2);
		System.out.println(sum1);
		
		int sum2 = mulnumber(num1,num2);
		System.out.println(sum2);
		
		int sum3 = divnumber(num1,num2);
		System.out.println(sum3);
		
		
	}

}
