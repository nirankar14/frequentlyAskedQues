package frequentlyAskedQues;

public class Swapping {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are .. " +a+ " "+b);
		
		//logic1 - Third value
		
//		int temp = a;
//		a = b;
//		b =temp;
		
		System.out.println("After swapping values are .. " +a+ " "+b);
		
		//Logic2 ---use + & - operator == Without using third variable
		
		/*
		 * a = a+b; // 10+20 = 30 b = a-b; // 30-20 = 10; a = a-b; // 30-10 = 20;
		 */
		//single statement swap
		
		b = a + b - (a=b);
		
		System.out.println("Using + & - operator after swapping are .. "+a+" "+b);
		
		
		

	}

}
