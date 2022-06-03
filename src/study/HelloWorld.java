package study;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
	String name = "Jae Rin Ada sochu";		
		int age = 25;
		float penisSize = (float) 4.7;
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("width");
		float width = scanner.nextFloat();
		System.out.println("height");
		float height = scanner.nextFloat();
		float area = width * height; 
		float perimeter = (width + height) * 2;
		System.out.println("area : " + area);
		System.out.println("perimeter : " + perimeter);
		

	}
}