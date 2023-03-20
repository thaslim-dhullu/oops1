package onesoft.course.day10OOPSCompostion;

public class UseCar {
	public static void main (String[]args) {
		Engine e = new Engine();
		e.enginecc = 200;
		e.isPetrol = true;
		Car c = new Car();
		c.brand = "Toyota";
		c.price = 800000;
		c.color = "Red";
		c.engine = e;
		System.out.println(c.brand+" "+c.price);
		System.out.println(c.engine.enginecc+" "+c.engine.isPetrol);
	}
}
class Car {
	String brand;
	int price;
	String color;
	Engine engine;
}
class Engine {
	int enginecc;
	boolean isPetrol;
}
