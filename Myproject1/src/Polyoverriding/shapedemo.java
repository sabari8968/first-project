package Polyoverriding;

public class shapedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape[] shapes = new shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new Circle(5.0);
		shapes[1] = new triangle(4.0, 3.0);
		shapes[2] = new square(6.0);

		// Demonstrate polymorphism by calling draw and erase methods
		for (shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}

	}

}
