package com.app.fruits;

import java.util.Scanner;

public abstract class Fruits {
	String color;
	double weight;
	String name;
	boolean isFresh = true;

	public Fruits() {

	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Name : " +  getName() + " " +  "Color : " + getColor() + " " +  " Weight " + getWeight();
	}

	

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public abstract String taste();

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color:");
		color = sc.next();

		System.out.println("Enter Name:");
		name = sc.next();

		System.out.println("Enter Weight:");
		weight = sc.nextDouble();
		
		System.out.println("isFresh(true/false): ");
		isFresh = sc.nextBoolean();

	}
	public void displayName() {
		System.out.println("Name = " + getName());
	}
	public void displayAll() {
		System.out.println(toString() + " " + "taste = " + taste() + " " + "isFresh = " + isFresh());
		
	}
}
