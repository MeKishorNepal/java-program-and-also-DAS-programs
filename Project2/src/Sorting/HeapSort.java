package Sorting;

public class HeapSort {
	public static void heapsort(int[]ar,int n) {
		
		//buildheap the heap as max
		try {
		for(int i=n/2-1;i>=0;i--) {
			heapify(ar,n,i);
		}
		//sort the heap and delete max heap swap and hepify
		for(int i=n-1;i>=0;i--) {
			swap(ar,0,i);
			heapify(ar,i,0);
		}}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		}
	
	private static void heapify(int[] ar, int n, int i) {
		int largest=i;
		int l=2*i;
		int r=2*i+1;
		
		if(l<n && ar[l]>ar[largest] && ar[l]>ar[r]) {
			largest=l;
		}
		if(r<n && ar[r]>ar[largest] && ar[l]<ar[r]) {
			largest=r;
		}
		if (largest !=i) {
			swap(ar,i,largest);
			heapify(ar,n,largest);
		}
		
		
	}
	
	private static void swap(int[] ar, int i, int j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		
		
	}

	public static void main(String[] args) {
		int ar[]= {56,33,6,8,99,12,42,45};
		heapsort(ar,ar.length);
		
		
		System.out.println("Sorted arr");
		for(int num:ar) {
			System.out.print(num+" ");
		}
		

	}

}
