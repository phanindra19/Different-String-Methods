package Different_stringmethods;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Java Interview Quations";

		// Reverse the String descending order
		// input=Java Interview Quations-------> output=""

		String[] s = str.split(" ");
		String revs = "";

		for (int i = 0; i < s.length; i++) {
			if (i == s.length - 1) {
				revs = s[i] + revs;
			} else {
				revs = " " + s[i] + revs;
			}
		}
		System.out.println(revs);

		// Reverse String each Word & letters also
		// input=Java Interview Quations-------> output="avaJ weivretnI snoitauQ"

		String[] w = str.split(" ");
		String revstr = "";

		for (int i = 0; i < w.length; i++) {
			String word = w[i];
			String revword = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revstr = revstr + revword + " ";
		}
		System.out.println(revstr);
 		
	}

}
