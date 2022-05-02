package Different_stringmethods;

import java.util.Arrays;

public class Small_Largest_num_in_Array {

	public static void main(String[] args) {

		int number[]= {-12,20,50,-89,1500,-1959,98995};
		
		int smallest=number[0];
		int largest=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest)
				largest=number[i];
			
			else if(number[i]<smallest){
				smallest=number[i];
			}
		}
		System.out.println("given array is :" + Arrays.toString(number));
		System.out.println("largest number::" + largest);
		System.out.println("smallest number::" + smallest);
	}
}
