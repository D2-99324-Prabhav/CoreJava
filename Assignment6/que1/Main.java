package que1;
import java.util.*;


class ExceptionLineTooLong extends Exception {

	ExceptionLineTooLong(){
		super("The strings is too long");
		
	}
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the String");
	    String str = sc.nextLine();
	    
	    int length = str.length();
	    
	    if(length > 80) {
	    	throw new ExceptionLineTooLong ();
	    }
	}
		catch(ExceptionLineTooLong  e){
			System.out.println(e.getMessage());
			
		}
}
}