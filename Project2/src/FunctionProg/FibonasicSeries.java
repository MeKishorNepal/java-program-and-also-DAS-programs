package FunctionProg;
import java.util.*;
public class FibonasicSeries {
	public static void fib(int numend) {
		int a=0,b=1;
		System.out.println(a);
		if(numend>1) {
			for(int i=1;i<numend;i++) {
				System.out.println(b);
				int temp=b;
				b=a+b;
				a=temp;
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numend=sc.nextInt();
		fib(numend);

	}

}
