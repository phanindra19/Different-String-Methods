package Different_stringmethods;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		int orgnum=num;
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.println(orgnum+" paliondrom num");
		}else {
		System.out.println(orgnum+" not a paliondrom num");
		}
	}

}
