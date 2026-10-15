import java.util.Scanner;
class que3{
	public static void main(String [] args) {
		int choice,quntity;
		double total = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n========== FOOD MENU ==========");
            System.out.println("1. Dosa       - Rs. 50");
            System.out.println("2. Samosa     - Rs. 20");
            System.out.println("3. Idli       - Rs. 30");
            System.out.println("4. Vada       - Rs. 25");
            System.out.println("5. Misal      - Rs. 60");
            System.out.println("6. Poha       - Rs. 30");
            System.out.println("7. Upma       - Rs. 35");
            System.out.println("8. Pav Bhaji  - Rs. 80");
            System.out.println("9. Tea        - Rs. 15");
            System.out.println("10. Generate Bill");
            System.out.println("===============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
           
            
            if(choice >=1 && choice <=9) {
            	 System.out.print("Enter quntity: ");
                 quntity = sc.nextInt();
                 
                 switch(choice) {
                 
                 case 1:
                	 total += 50*quntity;
                	 System.out.println("Dosa added.");
                	 break;
                 case 2:
                	 total += 20*quntity;
                	 System.out.println("Samosa added.");
                	 break;
                 case 3:
                	 total += 30*quntity;
                	 System.out.println("Idli added.");
                	 break;
                 case 4:
                	 total += 25*quntity;
                	 System.out.println("Vada added.");
                	 break;
                 case 5:
                	 total += 60*quntity;
                	 System.out.println("Misal added.");
                	 break;
                 case 6:
                	 total += 30*quntity;
                	 System.out.println("Poha added.");
                	 break;
                 case 7:
                	 total += 35*quntity;
                	 System.out.println("Upma added.");
                	 break;
                 case 8:
                	 total += 80*quntity;
                	 System.out.println("Pav Bhaji added.");
                	 break;
                 case 9:
                	 total += 15*quntity;
                	 System.out.println("Tea added.");
                	 break;
                	 
                 }
            }
                 else if(choice == 10) {
                	 System.out.println("Bill = " + " " + total);
                 }
                 
                 else {
                	 System.out.println("Enter Invalid Input");
                 }
                 
                         
 
                 
                 
            }while(choice != 10);
		     sc.close();
		}
	}
