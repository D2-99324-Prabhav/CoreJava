import java.util.*;
public class Employee {
private int id;
private String name;
private double salary;

public Employee() {
	
}

public Employee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	
}

public String toString() {
	return "Id" + id + " " + "Name" + " " + name + " " + "Salary" + " " + salary;
}

}

class FixedStack implements Stack{

	private Employee[] arr = new Employee[STACK_SIZE];
	private int top = -1;
	@Override
	public void push(Employee emp) {
		
		if(top == STACK_SIZE - 1) {

			 System.out.println("Error: Stack Overflow! Fixed stack is full.");
	            return;
		}
		arr[++top] = emp;
		System.out.println("Employee pushed to Fixed Stack successfully.");
		
	}

	@Override
	public Employee pop() {
		if(top == -1) {
	    System.out.println("Error: Stack Underflow! Fixed stack is empty.");
		return null;
	}
	 return arr[top--];	
	}
	
}

class GrowableStack implements Stack{
	private Employee[] arr = new Employee[STACK_SIZE];
	int top = -1;
	@Override
	public void push(Employee emp) {
		if(top == arr.length-1) {
			 System.out.println("Stack full! Automatically growing stack size from " + arr.length + " to " + (arr.length * 2));
			 Employee[] temp = new Employee[arr.length*2];
			 for(int i = 0; i <= top; i++) {
				 temp[i] = arr[i];
				 
			 }
			 arr = temp;
		}
		arr[++top] = emp;
		 System.out.println("Employee pushed to Growable Stack successfully.");
		
	}
	@Override
	public Employee pop() {
		if(top == -1) {
		    System.out.println("Error: Stack Underflow! Fixed stack is empty.");
			return null;
		}
		 return arr[top--];	
		 
		
	}
	
	
}
class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack myStack = null;
		int choice;
		
		do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 -- Choose Fixed Stack");
            System.out.println("2 -- Choose Growable Stack");
            System.out.println("3 -- Push data");
            System.out.println("4 -- Pop data & display");
            System.out.println("5 -- Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	if (myStack == null) {
                    myStack = new FixedStack();
                    System.out.println("Fixed Stack selected successfully.");
                } else {
                    System.out.println("Error: Stack type has already been chosen! You cannot change it.");
                }
                break;
            case 2:
            	if (myStack == null) {
                    myStack = new GrowableStack();
                    System.out.println("Growable Stack selected successfully.");
                } else {
                    System.out.println("Error: Stack type has already been chosen! You cannot change it.");
                }
                break;
            case 3:
            	 if (myStack == null) {
                     System.out.println("Error: NO stack chosen !!!");
                 } else {
                     System.out.print("Enter Employee ID: ");
                     int id = sc.nextInt();
                     System.out.print("Enter Employee Name: ");
                     String name = sc.next();
                     System.out.print("Enter Employee Salary: ");
                     double salary = sc.nextDouble();

                     Employee emp = new Employee(id, name, salary);
                     myStack.push(emp); // Dynamic Method Dispatch
                 }
                 break;
            case 4:
            	if (myStack == null) {
                    System.out.println("Error: NO stack chosen !!!");
                } else {
                    Employee poppedEmp = myStack.pop(); // Dynamic Method Dispatch
                    if (poppedEmp != null) {
                        System.out.println("Popped Data: " + poppedEmp);
                    }
                }
                break;

            case 5:
                System.out.println("Exiting application. Goodbye!");
                break;

            default:
                System.out.println("Invalid option! Please try again.");
        }
    } while (choice != 5);

    sc.close();

            	
            
	}
}
