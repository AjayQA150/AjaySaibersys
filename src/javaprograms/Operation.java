package javaprograms;
//Call by value
public class Operation {
	int data=50;
	void change(int data){
		data=data+50;//changes will be made in the local variable only.
	}
public static void main(String[] args) {
	Operation op=new Operation();
	System.out.println(op.data);
	op.change(500);
	System.out.println(op.data);
}
}
