import java.util.*;

public class DailyCost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total miles driven per day  ");
		double totalMiles = sc.nextDouble();

		System.out.println("Enter Cost per gallon of gasoline. ");
		double costPerGallon = sc.nextDouble();

		System.out.println("Enter Average miles per gallon. ");
		double avgPerMiles = sc.nextDouble();

		System.out.println("Enter Parking fees per day.  ");
		double parkingFees = sc.nextDouble();

		System.out.println("Enter Tolls per day.");
		double tolls = sc.nextDouble();

		double gallonsUsed = totalMiles / avgPerMiles;

		double gasCost = costPerGallon * gallonsUsed;

		double totalCost = gasCost + parkingFees + tolls;

		System.out.println("Total Cost = " + totalCost);

		sc.close();
	}

}
