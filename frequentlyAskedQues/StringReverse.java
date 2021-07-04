package frequentlyAskedQues;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "poojaa";
		String rev = "";
		
		/*
		 * String rev = "";
		 * 
		 * int len = str.length();
		 * 
		 * for( int i = len-1; i >= 0; i--) 
		 * { rev = rev + str.charAt(i); }
		 * 
		 * System.out.println("Reverse string is : "+rev);
		 */
		
		//Using character array
/*		char a[] = str.toCharArray();
		int len = a.length;
		
		for(int i = len-1; i >= 0; i--)
		{
			rev = rev+a[i];
		}
		System.out.println("Rverse string is :" +rev);
		
		*/
		
		//using StringBuffer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		}

}
