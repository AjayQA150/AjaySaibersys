package arrays;
//min number of an array by passing array to a method
public class Test1 {
	
	static void min(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				System.out.println("Mininum number is " +min);
			}
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]={33,3,4,5};
		min(arr);//passing array to a method 
	}

}
