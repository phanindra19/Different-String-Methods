package Different_stringmethods;

public class Factorial_Nmber {

	public static void main(String[] args) {

		int number=5;
		
		int factorial=1;
		
		for(int i=1; i<=number; i++) {
			factorial=factorial * i;
		}
		
		/*for(int i=number; i>=1; i--) {
			factorial=factorial * i;
		}*/
		System.out.println("factorial number : " + factorial);
	}

}
