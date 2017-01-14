package abstractclass;
abstract class Bike1{
	Bike1(){
		System.out.println("Start the bike");
	}
	abstract void run();
	void changegear(){
		System.out.println("change the gear..");
	}
}
public class Honda1 extends Bike1{
	void run(){
		System.out.println("Running....");
	}
public static void main(String[] args) {
	Bike1 b=new Honda1();
	b.run();
	b.changegear();

	
}
}
