package Pattern;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n=5;
		int number=1;
		
		//outer loop for row
		for(int i=1;i<=n;i++) {
			//inner loop for coloum
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}