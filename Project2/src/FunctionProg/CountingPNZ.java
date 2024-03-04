package FunctionProg;
import java.util.*;
public class CountingPNZ {
	public static void count(int number, int[] countArray) {
		int positive =0,negative=0,Zero=0;
		if(number>0) {
			countArray[0]++;
		}
		else if(number<0) {
			countArray[1]++;
		}
		else {
			countArray[2]++;
		}
		
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to continue and 0 to stop");
		int input=sc.nextInt();
		
		int[] countArray =new int[3];
		
		
		while(input==1) {
			System.out.println("Enter the number: ");
			int number=sc.nextInt();
			count(number,countArray);
			System.out.println("Press 1 to continue and 0 to stop");
			input =sc.nextInt();
	
			
		}
		//print the total counts
		System.out.println("Positive count:"+countArray[0]);
		System.out.println("Negative count:"+countArray[1]);
		System.out.println("Zero count:"+countArray[2]);	
		}
		
		

	}


