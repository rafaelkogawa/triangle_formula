package application;

import java.util.Locale;
import java.util.Scanner;

import caculator.Triangle;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the measures of triangle X: ");
	double x1 = sc.nextDouble();
	double x2 = sc.nextDouble();
	double x3 = sc.nextDouble();

	System.out.println("Enter the measures of triangle Y: ");
	double y1 = sc.nextDouble();
	double y2 = sc.nextDouble();
	double y3 = sc.nextDouble();
	Triangle triangle = new Triangle(x1, x2, x3, y1, y2, y3);
	
	triangle.pX();
	triangle.pY();

	
	System.out.printf("Triangle X area: %.4f%n ",  triangle.areaX());
	System.out.printf("Triangle Y area: %.4f%n ",  triangle.areaY());
	
	if(triangle.areaX() > triangle.areaY()) {
		System.out.println("Larger area X");
		}
	else {
		System.out.println("Larger area Y");
	}

	
	sc.close();
	}

}
