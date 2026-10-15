package que2;
import java.util.Scanner;
public class CreditCalculator {

	public static void main(String[] args) {
		int acNum;
		int balance;
		int totalCharges;
		int totalCredits;
		int creditLimit;
		int newBalance;
		
		
		System.out.println("Enter the number of customers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter Account Number :");
			acNum = sc.nextInt();
			
			System.out.println("Enter Balance :");
			balance = sc.nextInt();
			
			System.out.println("Enter Total Charges");
			totalCharges = sc.nextInt();
			
			System.out.println("Enter Total Credits");
			totalCredits = sc.nextInt();
			
			System.out.println("Enter Credit Limit");
			creditLimit = sc.nextInt();
			
			newBalance = balance + totalCharges - totalCredits;
			System.out.println("New Balance : " + newBalance);
			if(newBalance > creditLimit) {
				System.out.println("Credit limit exceeded");
			}
			
			
		}
	}
}
