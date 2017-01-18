package exceptionhndling;
//Exception handling using try/catch/finally
public class Exceptionhandling {
void test(){
	
	try	{
	int x=0,y=10;
	int num=y/x;
	System.out.println(num);

}catch(Exception e){
	
	System.out.println("Exception Occoured " +e);
}
	finally{
		System.out.println("This is finally block given outside of try/catch ");
	}
}

public static void main(String[] args) {
	Exceptionhandling eh=new Exceptionhandling();
	eh.test();
}
	
	
}

