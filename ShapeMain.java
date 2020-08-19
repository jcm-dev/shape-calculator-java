package meyerj;

import java.util.Scanner;

public class ShapeMain {

	static void menu() {
		System.out.println("**Shape Calculator**");
		System.out.println("Enter 1 for Circle.");
		System.out.println("Enter 2 for Square.");
		System.out.println("Enter 3 for Rectangle.");
		System.out.println("Enter 4 for Triangle.");
		System.out.println("Enter 5 to exit.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle circle = new Circle("Circle");
		Square square = new Square("Square");
		Rectangle rectangle = new Rectangle("Rectangle");
		Triangle triangle = new Triangle("Triangle");
		int option = 0;

		while (option != 5) {
			menu();
			option = input.nextInt();
			switch (option) {

			case 1:
				System.out.println("Please enter the radius");
				circle.setRadius(input.nextDouble());
				System.out.printf("Shape Name: %s%n", circle.getName());
				System.out.printf("Volume: %.2f%n", circle.getVolume());
				System.out.printf("Area: %.2f%n", circle.getArea());
				break;

			case 2:
				System.out.println("Please enter the side.");
				square.setSide(input.nextDouble());
				System.out.printf("Shape Name : %s%n", square.getName());
				System.out.printf("Volume: %.2f%n", square.getVolume());
				System.out.printf("Area: %.2f%n", square.getArea());
				break;

			case 3:
				System.out.println("Please enter the length.");
				rectangle.setLength(input.nextDouble());
				System.out.println("Please enter the width.");
				rectangle.setWidth(input.nextDouble());
				System.out.printf("Shape Name: %s%n", rectangle.getName());
				System.out.printf("Volume: %.2f%n", rectangle.getVolume());
				System.out.printf("Area: %.2f%n", rectangle.getArea());
				break;

			case 4:
				System.out.println("Please enter the length.");
				triangle.setLength(input.nextDouble());
				System.out.println("Please enter the base.");
				triangle.setBase(input.nextDouble());
				System.out.println("Please enter the height.");
				triangle.setHeight(input.nextDouble());
				System.out.printf("Shape Name: %s%n", triangle.getName());
				System.out.printf("Volume: %f%n", triangle.getVolume());
				System.out.printf("Area: %f%n", triangle.getArea());
				break;
			}
		}

	}

}
