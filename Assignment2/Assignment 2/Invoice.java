import java.util.Scanner;

public class Invoice {
	static class Hardware{
		private String p_num;
		private String p_discription;
		private int quntity;
		private double price;
		
		public Hardware(String p_num, String p_discription, int quntity,double price) {
			this.p_num = p_num;
			this.p_discription = p_discription;
			this.quntity = quntity;
			this.price = price;	
		}
		
		public double bill(String p_num, String p_discription, int quntity, double price){
			
			if(quntity < 0) {
				setQuntity(0);
			}
			if(price < 0.0) {
				setPrice(0.0);
			}
			setP_num(p_num);
			setP_discription(p_discription);
			
			double bill;
			return bill = quntity * price;
			
			
		} 
		
		public void setP_num(String p_num) {
			this.p_num = p_num;
		}
		public void setP_discription(String p_discription) {
			this.p_discription = p_discription;
		}
		public void setQuntity(int quntity) {
			this.quntity = quntity;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getP_num() {
			return p_num;
		}
		public String getP_discription() {
			return p_discription;
		}
		public int getQuntity() {
			return quntity;
		}
		public double getPrice() {
			return price;
		}
		
		
		
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to the Shantanu's Hardware");
		System.out.println("What is part name : ");
		String name = sc.next();
		
		System.out.println("Enter detials of part :");
		sc.nextLine();
		String disc =sc.nextLine();
		
		System.out.println("Enter quntity :");
		int quntity = sc.nextInt();
		
		System.out.println("Enter price of part : ");
		double price = sc.nextDouble();
		
		Hardware h1 =  new Hardware(name, disc, quntity, price);
		
		System.out.println("Your bill is : ");
		double bill = h1.bill(name, disc, quntity, price);
		System.out.println(bill);
		
		
		
	}

}
