package Different_stringmethods;

public class Smissing_Number {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,7,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("value of sum: "+ sum);
		
		int sum1=0;
		
		for(int i=1; i<=10; i++) {
			sum1=sum1+i;
		}
		System.out.println("value of sum1: "+ sum1);
		System.out.println("missing number: "+ (sum1-sum));
	}

}
