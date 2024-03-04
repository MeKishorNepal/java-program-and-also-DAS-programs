package twoDArray;

public class MatrixSparse {

	public static void main(String[] args) {
		int count=0;
		int row,col;
		int a[][]= {
				{1,3,4},
				{0,3,0},
				{0,0,0}
				};

	
	 row=a.length;
	 col=a[0].length;
	 
	 int size=row*col;
	 
	 //count Zeros
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 if(a[i][j]==0) {
				 count++;
			 }
		 }
	 }
	 if(count>(size/2)) {
		 System.out.println("The matrix is sparse matrix");
	 }
	 else {
		 System.out.println("The matrix is not sparse matrix");
	 }
	}

}
