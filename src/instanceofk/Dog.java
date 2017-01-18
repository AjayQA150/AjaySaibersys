package instanceofk;
class Animal{
	
}
public class Dog extends Animal {
public static void main(String[] args) {
	Dog d1=(Dog)new Animal();
	System.out.println(d1 instanceof Animal);
}
}
