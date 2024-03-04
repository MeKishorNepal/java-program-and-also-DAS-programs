package twoDArray;
import java.util.*;
public class MatrixMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		int result[][]=new int[m][n];
		
		if(m==q) {
			System.out.println("matrix multiple is possible");
			System.out.println("Enter a matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter matrix b");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					b[i][j]=sc.nextInt();
					
				}
			}
			
			//multiple
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					for(int k=0;k<p;k++) {
						result[i][j] +=a[i][k]*b[k][j];
					}
					
				}
				}
				
				//print
				System.out.println("Matrix multiple is");
				for( int i=0;i<m;i++) {
					for(int j=0;j<q;j++) {
						System.out.print(result[i][j]+" ");
						
					}
					System.out.println();
				}
				
			}
		
		else {
			System.out.println("Not possible");
		}
		
		
		

	}

}
