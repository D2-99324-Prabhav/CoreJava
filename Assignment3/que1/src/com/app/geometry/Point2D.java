package com.app.geometry;
import java.lang.Math;
public class Point2D {
	double x;
	double y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	 @Override
	   public String toString() {
	        return "x ='" + x + "', y =" + y + "}";
	    }
	public String getDetials() {
		return toString();
	}
		
	public boolean isEquals(Point2D p) {
	    return this.x == p.x && this.y == p.y;
	}	
	
	public double calculateDistance(Point2D p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		
		return Math.sqrt(dx * dx + dy * dy);
	}

}
	
