package frequentlyAskedQues;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		//using algorithm
		
		int rev = 0;  // tempperory variable
		
		while(num!=0) 
		{
			rev = rev * 10 + num % 10;
			num = num/10;
			
		}
		
		//using stringBuffer class
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reve  = sb.reverse();
		
		
		System.out.println("Reverse number is : " +rev);
		System.out.println("Reverse number is : " +reve);

	}

}
