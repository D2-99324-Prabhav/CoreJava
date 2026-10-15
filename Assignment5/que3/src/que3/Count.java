package que3;

import java.util.*;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		str = str.trim();
		
		if(str.length() == 0) {
			System.out.println("Counts =" + "0");
			
		}
		else
		{
			String[] words = str.split(" ");
			System.out.println("Counts = " + words.length);
			
		}
		sc.close();

	}
}
