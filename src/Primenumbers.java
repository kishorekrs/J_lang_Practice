
public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		boolean flag = false;
		for(int i=2;i<n/2;i++) {
			if(n%2==0) {
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println(n+" is not a prime");
		}
		else {
			System.out.println(n+" is a prime");
		}
	}

}
