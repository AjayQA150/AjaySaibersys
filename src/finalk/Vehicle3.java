package finalk;
//static final block can be initialized but only in static block 
class Vehicle3 {
	static final int  speedlimit;//static blank final variable
	static{
		speedlimit=60;
	}
	public static void main(String[] args) {
		System.out.println(Vehicle3.speedlimit);
		//Vehicle3.speedlimit
	}

}
