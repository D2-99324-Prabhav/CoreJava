package qu1;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the The String to reverse");
		String s = sc.nextLine();
		String rev = "";

		for(int i = s.length()-1; i >=0; i-- ) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of " + s + "=" + rev);

	}
}