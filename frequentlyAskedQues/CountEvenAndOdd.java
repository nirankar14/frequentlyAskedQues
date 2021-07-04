package frequentlyAskedQues;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to test :");
	
		
		int num = sc.nextInt();
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			
			int rem = num%10; //==> this gives last digit of number i.e remainder
			
			if(rem%2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
			num = num/10; //this expression will eleminate the last value(in number)
			
		}
		System.out.println("Number of even digits in number is: "+evenCount);
		System.out.println("Number of even digits in number is: "+oddCount);
	}

}
