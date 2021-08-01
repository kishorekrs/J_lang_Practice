
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1st Method - Using String Buffer
		String word = "Myjava";
		StringBuffer sb= new StringBuffer(word);
		System.out.println(sb.reverse());
		
//		2nd Method - Using Array of chars
		char[] ch = word.toCharArray();
		for(int j=ch.length-1;j>=0;j--) {
			System.out.print(ch[j]);
		}
		
		//3rd Method- Using Recursion
		System.out.println();
		System.out.println(reverse_string(word));
	}

	public static String reverse_string(String word) {
		if(null == word || word.length()<=1) {
			return word;
		}
		return reverse_string(word.substring(1))+word.charAt(0);
	}
}
