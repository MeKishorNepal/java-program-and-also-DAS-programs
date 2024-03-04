package Pattern;

public class NumberPyramid {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			//for space print first
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//for number print
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
