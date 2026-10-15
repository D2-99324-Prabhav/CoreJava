package que2;

import java.util.*;

class NegativeException extends Exception {

	NegativeException() {
		super("Diameter can not be Negative");
	}
}

public class Circle {

	double myX;
	double myY;
	double diameter;

	public Circle(double myX, double myY, double Diameter) {
		this.myX = 0;
		this.myY = 0;
		this.diameter = 200;
	}

	public double getMyX() {
		return myX;
	}

	public double getMyY() {
		return myY;
	}

	public double getDiameter() {
		return diameter;
	}

}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter point 1:");
			double myX = sc.nextDouble();
			
			System.out.println("Enter point 2:");
			double myY= sc.nextDouble();
			
			System.out.println("Enter Diameter:");
			double diameter= sc.nextDouble();
			
			if(diameter < 0) {
				throw new NegativeException();
			}
			
			System.out.println("Diameter is greater than 0");
			
		}
		
		catch(NegativeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
