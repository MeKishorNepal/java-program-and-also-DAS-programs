package twoDArray;
import java.util.*;
public class TwoDarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows =sc.nextInt();
		int cols =sc.nextInt();
		
		//Declaration of 2D array
		int [][]numbers=new int[rows][cols];
		 
		//controls rows
		for(int i=0;i<rows;i++) {
			//controls cols
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
				
			}
		}
		//output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
