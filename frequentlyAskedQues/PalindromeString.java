package frequentlyAskedQues;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string : ");
		
		String str = sc.nextLine();
		
		String originalStr = str;
		
		String rev = "";
		
		int len = str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(originalStr == str) 
		{
			System.out.println(originalStr+" is palindrome string");
		}
		else {
			System.out.println(originalStr+" is not palindrome string");
		}

	}

}
