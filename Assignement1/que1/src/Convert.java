import java.util.Scanner;
public class Convert {

	public static void main(String [] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Given number : " + " " + input);
		
		Integer b = new Integer(input);
		String binary = b.toBinaryString(b);
		System.out.println("Binary equivalent : " + " " + binary);
		String octal = b.toOctalString(b);
		System.out.println("Octal equivalent : " + " " + octal);
		String hexa = b.toHexString(b);
		System.out.println("Hexadecimal equivalent : " + " " + hexa);
	}
}
