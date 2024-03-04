package twoDArray;
import java.util.*;
public class MatrixElementCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean flag=false;
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		
		//Input matrix elements
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		//input second matrix elements
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		//measure the each row and col size
		m=a.length;
		n=a[0].length;
		
		p=b.length;
		q=b[0].length;
		
		//checks if dimensions of both matrices are equal
		if(m!=p||n!=q) {
			System.out.println("Matrices are not equals");
		}
		else {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j]!=b[i][j]) {
						flag=false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println("Matrices are not equal");
			}
			else {
				System.out.println("Matrices are  equal");
			}
			
		}
		

	}

}
