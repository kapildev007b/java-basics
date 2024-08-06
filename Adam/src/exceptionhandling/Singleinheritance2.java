package exceptionhandling;

public class Singleinheritance2 extends Father {
	public void marketing() {
		System.out.println("marketing");
	}
	public static void main(String[]args) {
		Singleinheritance2 obj = new Singleinheritance2();
		obj.shop();
		obj.buisseness();
		
	}

}
