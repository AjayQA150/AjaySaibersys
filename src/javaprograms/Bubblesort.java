package javaprograms;

public class Bubblesort {
	
	 static void bubblesort(int[] arr){
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[]={3,60,35,2,45,320,5};
	int size=arr.length;
	System.out.println("length is " +size);
	System.out.println("Array before bubble sort");
	for(int i=0;i<size;i++){
		System.out.println(arr[i]+"");
	}
	bubblesort(arr);
	System.out.println("Array after bubble sort ");
	for(int i=0;i<size;i++){
	System.out.println( +arr[i]);
	}
	
}
}
