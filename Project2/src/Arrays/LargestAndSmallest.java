package Arrays;

public class LargestAndSmallest {
	public static int getSmallest(int a[],int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[0];
		
	}

	public static void main(String[] args) {
		int a[]=new int[] {4,5,6,4,3,7,8,1};
		int b[]=new int[] {90,45,33,67,87,65,55};
		
		//Arrays.sort(a);
		
		getSmallest(a,8);
		getSmallest(b,7);
		System.out.println(getSmallest(a,8));
		System.out.println(getSmallest(b,7));
		

	}


}