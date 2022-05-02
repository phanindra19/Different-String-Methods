package Different_stringmethods;

public class Armstrong_Number {

	public static void main(String[] args) {

		int a=153;
		int temp=a;
		int r,sum=0;
		
		while(a>0) {
			r=a%10;
			a=a/10;
			sum=sum + r*r*r;
		}
		if(temp==sum)
			System.out.println("its an armstrong number");
		
		else 
			System.out.println("not an armstrong number" );
	}
}
