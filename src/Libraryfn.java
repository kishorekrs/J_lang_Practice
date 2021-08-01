

public class Libraryfn {

	public String nonStart(String a, String b) {
		 
			  return a.substring(1,a.length())+ b.substring(1,b.length());
//				nonStart("Hello", "There")="ellohere"
	}
	
	public String theEnd(String str, boolean front) {
		  if(front) {
			  return Character.toString(str.charAt(0));
		  }
		  return Character.toString(str.charAt(str.length()-1));
	}

	public boolean endsLy(String str) {
		  if(str.endsWith("ly")) {
			  return true;
		  }
		  return false;
	}
	
	public String middleThree(String str) {
		int a= str.length()/2-1;
		int b = str.length()/2+1+1;
		return str.substring(a,b);
		
//		middleThree("Candy") = "and"
//		middleThree("and") = "and"
//		middleThree("solving") = "lvi
	}
	
	public String lastChars(String a, String b) {
		  if(a.length()>0 & b.length()>0) {
			  return Character.toString(a.charAt(0))+Character.toString(b.charAt(b.length()-1));
		  }
		  else if(a.length()>0 & b.length()==0){
			  return Character.toString(a.charAt(0))+"@";
		  }
		  else if(a.length()==0 & b.length()>0) {
			  return "@"+Character.toString(b.charAt(b.length()-1));
		  }
		  return "@@";
	}
	
	
	public String multiple2chars(String word) {
//		Ex1: ("Hello") = "HeHeHe"
		if(word.length()>1) {
			return word.substring(0,2)+word.substring(0,2)+word.substring(0,2);
		}
		else if(word.length()==1) {	
			return word.substring(0,1)+word.substring(0,1)+word.substring(0,1);
		}
		else{
		  return "";
		}
		
	}
	
	public String multiple2chars_2(String word) {
		String a = "";
		int copies=3;
		if(word.length()<2) {
			int i=0;
			while(i<copies) {
				i++;
				a = a+word;
			}
			return a;			
		}
		else {
			char[] ch = word.toCharArray();
			String f =  Character.toString(ch[0]).concat(Character.toString(ch[1]));
			for(int j=0;j<copies;j++) {
				a = a+f;
			}
			return a;
		}
	}
	
	public String concatstrings(String s1, String s2) {
//		Ex2:("Yo", "Alice")= "YoAliceAliceYo"
		return s1.concat(s2)+s2.concat(s1);
		
	}
	
	public void string_reverse(String a) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}
	
	public void string_builder_reverse(String word) {
		StringBuilder sb = new StringBuilder(word);
		System.out.println(sb.reverse());
	}
	
	public void reverse_number(int num) {
		int rem = 0;
		while(num>0) {
			rem = (rem *10) + num %10;
			num = num /10;
		}
		System.out.println(rem);
	}
	
	public String seeColor(String str) {
		if(str.startsWith("blue")) {
			return "blue";
		}
		else if(str.startsWith("red")) {
			return "red";
		}
		else {
			return "";
		}
		
	}
	
}

