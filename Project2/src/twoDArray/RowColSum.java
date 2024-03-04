package twoDArray;

public class RowColSum {

	public static void main(String[] args) {
		
		int row,col;
		 
		int a[][]= {
				{1,3,2},
				{4,5,3},
				{6,7,3}
		};
		
		row=a.length;
		col=a[0].length;
		
		//sum of rows elements
		for(int i=0;i<row;i++) {
			int sumRow=0;
			for(int j=0;j<col;j++) {
				sumRow +=a[i][j];
				
			}
			System.out.println("sum of "+(i+1+"row"+sumRow));
		}
		
		//sum of cols elemets
		for(int i=0;i<col;i++) {
			int sumcol=0;
			for(int j=0;j<row;j++) {
				sumcol +=a[j][i];
				
			}
			System.out.println("sum of "+(i+1)+"col "+sumcol);
		}

	}

}
