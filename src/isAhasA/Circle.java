package isAhasA;
class Operation{
	int square(int n){
		return n*n;
	}
}

public class Circle {	
	Operation op;//aggregation
	double pi=3.14;
	double  area(int radius){
		op=new Operation();
		int r=op.square(radius);//code reusability(i.e delegates the method call)
		return pi*r;
		
	}
public static void main(String[] args) {
	Circle c=new Circle();
	double result=c.area(5);
	System.out.println(result);
	
}
}
