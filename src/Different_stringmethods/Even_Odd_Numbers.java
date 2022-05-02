package Different_stringmethods;

public class Even_Odd_Numbers {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i]);

		}
		System.out.println("--------------");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.println(a[i]);
		}

		//Enhanced for loop
		
		System.out.println("-----------------------");
		
		for(int value :a) {
			if(value%2==0)
				System.out.println(value);
		}
		
		System.out.println("-----------------------");
		
		for(int value:a) {
			if(value%2!=0)
				System.out.println(value);
		}
		
		
		String str="java with selenium";
		String[] S=str.split(" ");
		String ns="";
		for(int i=0; i<S.length; i++) {
			
		}
	}

}
