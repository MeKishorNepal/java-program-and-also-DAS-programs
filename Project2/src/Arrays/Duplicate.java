package Arrays;

public class Duplicate {

	public static void main(String[] args) {
	int arr[]=new int[]{1,3,3,2,1,4,5,6};
	
	System.out.println("The duplicate elements are");
	
	//Searches for duplicate element
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
			System.out.println(arr[j]);
		}
	}

	}

}
