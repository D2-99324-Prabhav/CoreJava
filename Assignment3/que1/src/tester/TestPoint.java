package tester;
import com.app.geometry.*;
import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the co-rodinate of 1st point : ");
		System.out.println("X1 : ");
		double x1 =sc.nextDouble();
		System.out.println("Y1 : ");
		double y1 =sc.nextDouble();
		
		System.out.println("Enter the co-rodinate of 2nd point : ");
		System.out.println("X2 : ");
		double x2 =sc.nextDouble();
		System.out.println("Y2 : ");
		double y2 =sc.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println(p1.getDetials());
	    System.out.println(p2.getDetials());
		
		if(p1.isEquals(p2)) {
			System.out.println("Both points are Equal");
			
		}
		else {
			System.out.println("Distance between two points : " + p1.calculateDistance(p2));
		}
		
	}
}
