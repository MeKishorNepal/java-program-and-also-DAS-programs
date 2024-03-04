package twoDArray;
import java.util.*;
public class TriangularMatrixDiagonal {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			
			}
		}
		
		m=a.length;
		n=a[0].length;
		
		if(m!=n) {
			System.out.println("Matrix should be a square matrix");
		}
		else {
			//perorms required operation to convert given matridx
			//into lower triangular matrix
			System.out.println("Lower triagular matrix:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(j>i) {
						System.out.print("0");
					}
					else {
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
		

	}


}