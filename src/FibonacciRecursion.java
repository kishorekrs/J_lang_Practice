import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciRecursion {
	
	static int n1=0,n2=1,n3=0;
	
	public static void fibonacci(int count) {
//		String a = "abc";
		
		if(count>0) {
			System.out.println("Count :"+count);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
	//		System.out.print(",");
			count--;
			fibonacci(count);
		}
//		System.out.println("Hi");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many numbers needed: ");
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		sc.close();
		System.out.println(n1+","+n2+",");
		fibonacci(count);

}
}
