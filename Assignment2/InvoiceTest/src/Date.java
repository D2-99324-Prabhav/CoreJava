import java.util.Scanner;
public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public void displayDate() {
		System.out.println("Date : " + " " + day + "/" + month +  "/" + year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
class DateTest {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Date test = new Date(0,0,0);
		
		System.out.println("Enter Date : ");
		System.out.println("Day : ");
		test.setDay(sc.nextInt());
		
		System.out.println("Month : ");
		test.setMonth(sc.nextInt());
		
		System.out.println("Year : ");
		test.setYear(sc.nextInt());
		
		
		test.displayDate();
		
		
		
	}
}
