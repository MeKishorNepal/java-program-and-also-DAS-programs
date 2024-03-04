package Sorting;

public class BubbleSort {
	public static void printarr(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[]= {3,5,6,8,5,3};
		
		
		//bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
							
				}
			}
		}
		printarr(arr);
		
	}

}
