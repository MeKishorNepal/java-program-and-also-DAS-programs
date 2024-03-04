package Arrays;

public class ElementFrequency {

	public static void main(String[] args) {
		int arr[]= {2,3,5,2,3,4,4,4,5,5,3};
		int freq[]=new int[arr.length];
		int visited=-1;
		
		//for loop to count all ele
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
					
				}
			}
			if(freq[i]!=visited) {
			freq[i]=count;
			}
		}
		
		//print the fre
		System.out.println("The frequency of elements are");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(arr[i]+"  "+freq[i]);
			
		
	}
			}
	}
}
	


