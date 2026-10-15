package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	static Scanner sc = new Scanner(System.in);
	static int counter = 0;

	public static int menulist() {

		System.out.println("-------------Menu List---------------");
		System.out.println("0.Exit");
		System.out.println("1.Add Apple");
		System.out.println("2.Add Mango");
		System.out.println("3.Add Orange");
		System.out.println("4.Display the Names of Fruits");
		System.out.println("5.Display Basket");
		System.out.println("6.Display Taste of stale Fruits");
		System.out.println("7.Mark Fruit as stale");

		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of basket: ");
		int n = sc.nextInt();
		Fruits[] basket = new Fruits[n];


int choice;
		
		do {
			 choice = menulist();
			System.out.println("choice= "+choice);
			switch (choice) {

			case 1:
				
				basket[counter] = new Apple();
				 System.out.println("Apple");
				 basket[counter].accept();
				counter++;
				break;
			case 2:
				basket[counter] = new Mango();
				 System.out.println("Mango");
				 basket[counter].accept();
				counter++;
				break;
			case 3:
				basket[counter] = new Orange();
				 System.out.println("Orange");
				 basket[counter].accept();
				counter++;
				break;
			case 4:
				for(Fruits e : basket) {
					if(e!=null) {
					e.displayName();
					}
				}
				break;
			
			case 5:
				for(Fruits e : basket) {
					if(e!=null) {
					e.displayAll();
					}
				}
				break;

			case 6:
				for(Fruits e : basket) {
					if(e.isFresh == false) {
						e.displayAll();
					}
				}
				break;
				
			case 7:
				System.out.println("Enter index to mark stale");
				int index = sc.nextInt();
				if(index > basket.length-1) {
					System.out.println("Invalid Index");
				}
				System.out.println("Enter false for stale");
				boolean f = sc.nextBoolean();
				basket[index].setFresh(f);
				break;
				
			case 8:
				for(Fruits e : basket) {
					if(e!=null) {
					if(e.taste().equals("sour")) {
						e.isFresh = false;
					}
					}
				}
				break;
			 default:
				 System.out.println("invalid");
				 break;
				

			}
		}while(choice!=0);

	}

}
