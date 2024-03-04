package Arrays;

public class EvenOddPosition {

	public static void main(String[] args) {
		int arr[]=new int[] {1,3,2,8,7,6};
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//loop through the arry incrementing by 2
		//here i will start 1 as first even positon elment
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
			
			
		}
		
		System.out.println();
		
		
		//for odd positon elements
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}

	}

}
