package twoDArray;
import java.util.*;
public class AddMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m= sc.nextInt();
		int n=sc.nextInt();
		
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		int numbers [][]=new int [m][n];
		int Snumbers[][]=new int[p][q];
		int result[][]=new int[m][n];
		
		System.out.println("Enter the first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix");
		
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				Snumbers[i][j]=sc.nextInt();
			}
		}
		
		//Add
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				result[i][j]=numbers[i][j]+Snumbers[i][j];
				
				
			}
		}
		//print rresult
		
		System.out.println("The addtion of matrix is");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}

	}

}
