import java.util.Scanner;
public class que2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value1 :");
		if (!sc.hasNextDouble()) {
			System.out.println("Error: Number 1 is not a valid number.");
			sc.close();
            return;
		}
		 double v1 = sc.nextDouble();
		 System.out.println("Valid double received: " + v1); 
      
        if (!sc.hasNextDouble()) {
			System.out.println("Error: Number 2 is not a valid number.");
			sc.close();
            return;
		}
        double v2 = sc.nextDouble();
        System.out.println("Valid double received: " + v1 ); 
        sc.close();
        double avrage = (v1+v2)/2;
        System.out.println("Average : " + avrage);
        sc.close();
		}
	}
