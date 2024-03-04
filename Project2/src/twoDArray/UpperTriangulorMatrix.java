package twoDArray;
import java.util.*;
public class UpperTriangulorMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
			System.out.println("Matrix should be square matrix");
		}
		else {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(i>j) {
						System.out.print("0"+" ");
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
