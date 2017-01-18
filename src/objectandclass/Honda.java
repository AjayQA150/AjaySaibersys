package objectandclass;
//final method cannot be Overrided,Final class cannot be extended
final class Bike{
	final void run(){
		System.out.println("About to Run......");
	}
}
public class Honda extends Bike {
void run(){
	System.out.println("Running");
	
}
public static void main(String[] args) {
	Honda h=new Honda();
	h.run();
}
}
