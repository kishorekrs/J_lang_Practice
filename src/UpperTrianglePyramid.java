import java.util.Scanner;

public class UpperTrianglePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int num = sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
