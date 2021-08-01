import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a;
		i=0;
		a =0;		
		int b = 1;
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		sc.close();
		int sum;
		System.out.print(a+","+b+",");
		while(i<count) {
			sum = a + b;
			System.out.print(sum);
			if (i<count)System.out.print(",");
			a = b;
			b = sum;
			i++;
		}
		
	}
	

}
