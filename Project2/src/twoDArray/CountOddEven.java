package twoDArray;
import java.util.*;
public class CountOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int rows,cols,countOdd=0,countEven=0;
		
		int a[][]= {{4,3,2},
				{1,2,3},
				{5,6,7}
		};
		
		rows=a.length;
		cols=a[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]%2==0) {
					countEven++;
				}
				else {
					countOdd++;
				}
			}
		}
			
			System.out.println("Frequency of odd number "+ countOdd);
			System.out.println("Frequency of even number "+ countEven);
		
				
	}

}
