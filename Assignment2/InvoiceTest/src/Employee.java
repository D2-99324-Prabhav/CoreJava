import java.util.Scanner;
public class Employee {

	private String fisrtName;
	private String lastName;
	private double salary;
	
	
	public Employee(String fisrtName, String lastName, double salary) {
		
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public void yearlySalary() {
		double ys = 12 * salary;
		System.out.println("Yearly Salary = " + ys);
		
	}
	public void raiseSalary() {
		double ys = 12 *salary;
		double raise = ys + (ys * 10/100);
		System.out.println("Salary after raise = " + raise);
	}
	public String getFisrtName() {
		return fisrtName;
	}
	
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary > 0) {
		this.salary = salary;
		}
	}
	
	
}
class EmployeeTest{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(null, null, 0);
		Employee e2 = new Employee(null, null, 0);
		
		//for Employee 1
		System.out.println("Enter the Detials of Emloyee 1 ");
		System.out.println("Enter First Name :");
		e1.setFisrtName(sc.next());
		
		System.out.println("Enter Last Name : ");
		e1.setLastName(sc.next());
		
		System.out.println("Enter Salary : ");
		e1.setSalary(sc.nextDouble());
		e1.yearlySalary();
		e1.raiseSalary();
		
		System.out.println();
		//for Employee 2
		System.out.println("Enter the Detials of Emloyee 2 ");
		System.out.println("Enter First Name :");
		e2.setFisrtName(sc.next());
		
		System.out.println("Enter Last Name : ");
		e2.setLastName(sc.next());
		
		System.out.println("Enter Salary : ");
		e2.setSalary(sc.nextDouble());
		e2.yearlySalary();
		e2.raiseSalary();
		
		
		
		
	}
}
