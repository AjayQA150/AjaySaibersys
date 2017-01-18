package finalk;
//blank final block can be initialized but only in constructor

public class Vehicle2 {
final int speed;
Vehicle2(){
	speed=70;
	System.out.println("Speed Limit  " +speed);
}
public static void main(String[] args) {
	new Vehicle2();
}

}
