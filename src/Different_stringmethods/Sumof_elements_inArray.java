package Different_stringmethods;

public class Sumof_elements_inArray {

	public static void main(String[] args) {

		
		int a[]= {5,9,8,6,2,5,4};
		int sum=0;
		
		//Length of the array
		
		System.out.println(a.length);
		
		/*for(int i=0; i<=a.length-1; i++) {
				sum=sum+a[i];
				
		}*/
		
		for(int value:a) {
			sum=value+sum;
		}
			
		System.out.println("sum of elements: "+ sum);
	}

}
