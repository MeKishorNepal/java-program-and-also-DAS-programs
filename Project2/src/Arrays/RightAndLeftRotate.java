package Arrays;

public class RightAndLeftRotate {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6};
		//Determine the number of arraya should be rotated
		int n=2;
		
		//Display the original array
		System.out.println("Original array");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
		
		
		//Rotate the given array be n times towards the left
		for(int i=0;i<n;i++) {
			int j,first;
			//stores the first element of array
			first=arr1[0];
			for( j=0;j<arr1.length-1;j++) {
				//shifting element of array by one
				arr1[j]=arr1[j+1];
			}
			//first element of array will be added to the end
			arr1[j]=first;
		}
	
		
		System.out.println();
		//Displays the resulting array after rotation
		System.out.println("Array after left rotation");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
		
		
		System.out.println();
		
		
		
		//Right shifting
		
		for(int i=0;i<n;i++) {
			int j,last;
			//Store last value
			last=arr1[arr1.length-1];
			for(j=arr1.length-1;j>0;j--) {
				arr1[j]=arr1[j-1];
			}
			arr1[0]=last;
		}
		System.out.println();
		
		//Display resulting arrya after right rotation
		System.out.println("Array After rigth rotation");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		

	}

}
