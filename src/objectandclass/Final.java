package objectandclass;

public  class Final {
final int speedlimit=400;//final variable
 void run(){
	 speedlimit=600;
	//System.out.println(speedlimit);
}
public static void main(String[] args) {
	Final f1=new Final();
	f1.run();
}
}
