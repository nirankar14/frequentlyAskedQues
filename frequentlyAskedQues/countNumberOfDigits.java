package frequentlyAskedQues;

public class countNumberOfDigits {

	public static void main(String[] args) {
	
		int number = 123456;
		int count = 0;
		
		while(number > 0)
		{
			number = number/10;  //==>this will eliminate last digit of number
			count++;
			
		}
		System.out.println("number of digits in a number : "+count);
	}

}
