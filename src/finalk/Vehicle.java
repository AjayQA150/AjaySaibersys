package finalk;
class Bike{
	final void run(){
		System.out.println("Running...");
	}
}

public class Vehicle extends Bike {
int speed=900;

	public static void main(String[] args) {
	
	new Vehicle().run();
		
	}
}
