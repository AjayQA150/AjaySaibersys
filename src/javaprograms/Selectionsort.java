package javaprograms;

public class Selectionsort {
	
static void selectsort(int[] arr){
	
	for(int i=0;i<arr.length-1;i++){
		int index=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[index]){
				index=j;//searching for lowest index
			}
		}
		int smallernumber=arr[index];
		arr[index]=arr[i];
		arr[i]=smallernumber;
		
		}
	}

	
	
public static void main(String[] args) {
	int arr[]={18,9,33,4,84,32};
	System.out.println("Array before selection sort");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+"");
	}
	selectsort(arr);
	System.out.println("Array after selection sort");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
