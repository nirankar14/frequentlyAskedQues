package frequentlyAskedQues;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,80};
		
		int search = 300;
		boolean flag = false; 
		
		for(int i = 0; i < a.length; i++)
		{
//			System.out.println(a[i]);
			if(search == a[i])
			{
				System.out.println("Element found at: "+i);
				flag = true;
				break;
			}
		}
		if(flag == false) 
		{
		System.out.println("Element not found");
		}
	}

}
