package que2;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String num =sc.next();
		
		String rev ="";
		
		for(int i = num.length()-1; i >= 0; i--) {
			rev = rev + num.charAt(i);
			
		}
		
		if(num.equals(rev)) {
			System.out.println("The number is Palindrome" + " " + num + "=" + rev);
		}
		else {
			System.out.println("Number is not Palindrome"+ " " + num + "!=" + rev);
		}
		
		
		
		
	}
}
