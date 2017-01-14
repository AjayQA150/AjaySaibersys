package abstractclass;
abstract class Bank{
	abstract int getrateofintrest();
}
//In real scenario this implementation is hidden by end user
class SBI extends Bank{
	int  getrateofintrest(){
		return 7;
	}
}
class PNB{
	int getrateofintrest(){
		return 8;
	}
}
//user gets the method
public class TestBank {
public static void main(String[] args) {
	Bank b=new SBI();
	int in=b.getrateofintrest();
	System.out.println("The intrest rate is " +in +"%");
	
}
}
