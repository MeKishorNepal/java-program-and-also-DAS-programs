package twoDArray;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		//Declaration
		int numbers[][]=new int [m][n];
		
		//input
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		
		//original  matrix
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		//Transpose matrix
		System.out.println("The Transpose matrix is ::");
		
		for(int j=0;j<n;j++) {
			for(int i=0;i<m;i++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}


}