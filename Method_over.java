package Javademo;

public class Method_over {
	static  int myAddition(int x , int y) {
		return x + y;
		
	}
	static int myMultiplication(int x , int y) {
		return x * y ;
	}
	
	public static void main (String[] args) {
		int Add= myAddition(10,20);
		int mul= myMultiplication(11,21);
		System.out.println("Add:::"+Add);
		System.out.println("mul::::"+mul);
	}
}
