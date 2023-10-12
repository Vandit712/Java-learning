package Javademo;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Value A:"); 
		int a = s.nextInt();
		System.out.println("enter the Value B:");
		int b = s.nextInt();
		 System.out.println("Sum is:"+(a+b));
		 System.out.println("Sub is:"+(a-b));
		 System.out.println("Div Is:"+(a/b));
		 System.out.println("mul is :"+(a*b));
	}

}