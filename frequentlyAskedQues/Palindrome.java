package frequentlyAskedQues;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt(); //storing value into integer in variable num
		
		int original = num;
		
		//now reverse number
		
		int rev = 0;
		while(num!=0)
		{
			rev =rev*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse number is: " +rev );
		
		if(original == rev) {
			
			System.out.println(+original+" is Palindrome number");
		}
		else
		{
			System.out.println(+original+" is not a palindrome number");
		}

	}

}
