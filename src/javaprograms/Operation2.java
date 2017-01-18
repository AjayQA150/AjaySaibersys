package javaprograms;

public class Operation2 {
	int data=50;
	void change(Operation2 op){
		op.data=100+op.data;
	}
public static void main(String[] args) {
	Operation2 op=new Operation2();
	System.out.println(op.data);
	op.change(op);
	System.out.println(op.data);
}
}
