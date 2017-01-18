package methodoveriding;

public class Test {
public static void main(String[] args) {
	SBI s=new SBI();
	AXIS a=new AXIS();
	INDUS i=new INDUS();
	System.out.println("roi for SBI:  " +s.getrateofinterest());
	System.out.println("roi for SBI: " +a.getrateofinterest());
	System.out.println("roi for SBI:" +i.getrateofinterest());

	
	
}
}
class BANK{

}

class SBI{
	int getrateofinterest(){
		return 7;
	}
}

class AXIS{
	int getrateofinterest(){
		return 8;
	}
}

class INDUS{
	int getrateofinterest(){
		return 9;
	}
}