/*
 * 
 * Improved version of product of array task
 */
public class IMPProductOfArray {

	public static void main(String[] args)
	{
		int[] list = {1,2,3,4,5};
		
				
		// The left and right arrays which will contain all the numbers on the left and all the numbers on the right
		int[] L = new int[list.length];
		int[] R = new int[list.length];
		
		int[] answer = new int[list.length];
		
		//sets the beginning list as 1
		L[0] = 1;
		
		System.out.println("Left: ");
		for(int i =1; i < list.length; i++)
		{
			//get the previous number in the 'list' array and multiply it by the previous number in the 'L' array
			L[i] = list[i - 1] * L[i - 1];
			
			System.out.print(L[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Right: ");
		
		//sets the end of the right array as 1
		R[list.length-1] =1;
		
		for(int i = list.length -2; i >= 0; i--)
		{
			R[i] = list[ i + 1] * R[i + 1];
			
			System.out.print(R[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Output: ");
		
		for(int i =0; i < list.length;i++)
		{
			answer[i] = L[i] * R[i];
			
			System.out.print(answer[i] + ", ");
		}
		
		
		
	}
}
