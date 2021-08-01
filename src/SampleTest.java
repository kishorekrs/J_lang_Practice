import java.util.Scanner;

public class SampleTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string with odd lenght");
		String a = s.next();

		if (a.length() < 3) {
			System.out.println("Lenght of string should be at least 3 char lenght");
		} else if (a.length() % 2 == 0) {
			System.out.println("Lenght should be odd");
		} else {

			if (a.length() == 3) {
				System.out.println(a);
			} else {
				int l = a.length() - 3;
				int g = l / 2;

				for (int i = g; i < a.length() - g; i++) {
					System.out.print(a.charAt(i));
				}
			}
		}
		s.close(); 
	}

}
