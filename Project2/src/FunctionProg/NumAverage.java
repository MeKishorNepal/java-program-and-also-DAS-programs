package FunctionProg;
import java.util.*;
public class NumAverage {
	public static void average(int n1,int n2, int n3) {
		double avg=0;
		avg +=(n1+n2+n3)/3;
		System.out.println(avg);
				
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		average(n1,n2,n3);
		
		
	}

}
