package gettersandsetters;

public class Patient {
private String name;
private int height;
private int weight;
private int numVisits;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
	}
/*public void setHeight(int height){
	this.height=height;
}
public int getHeight(){
	return height;
}*/
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	if(height>0){
		this.height = height;
	}
}


}
