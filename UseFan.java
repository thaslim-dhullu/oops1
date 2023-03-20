package onesoft.course.day10OOPSCompostion;

public class UseFan {
	public static void main (String[]args) {
		Coil coil = new Coil();
		coil.companyName = "Ravi pvt. ltd.";
		coil.materialType = "Copper";
		coil.pricePerTonne = 32;
		coil.weightInKg = 2;
		Fan fan = new Fan();
		fan.brand = "Crompton";
		fan.colour = "Brown";
		fan.price = 1200;
		fan.isReversible = true;
		fan.coil = coil;
		System.out.println(fan.brand+" "+fan.colour+" "+fan.price+" "+fan.isReversible);
		System.out.println(fan.coil.companyName+" "+fan.coil.materialType+" "+fan.coil.pricePerTonne+" "+fan.coil.weightInKg);
	}
}
class Fan {
	String brand;
	String colour;
	int price;
	boolean isReversible;
	Coil coil;
}
class Coil {
	String companyName;
	String materialType;
	int pricePerTonne;
	int weightInKg;
}
