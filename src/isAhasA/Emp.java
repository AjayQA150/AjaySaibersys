package isAhasA;

public class Emp {
	int id;
	String name;
	Address address;
	 Emp(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.println(id +""+name);
		System.out.println(address.city+","+address.state+","+address.country);
	}
public static void main(String[] args) {
	Address a1=new Address("dallas","TX","USA");
	Address a2=new Address("Houston","MO","UK");

	Emp e1=new Emp(5220,"jason",a1);
	Emp e2=new Emp(5221,"bourne",a2);
	e1.display();
	e2.display();
	
}
}

class Address{
	String city;
	String state;
	String country;
	Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}