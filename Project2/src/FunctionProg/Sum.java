package FunctionProg;
import java.util.*;
public class Sum {
	public static void sumodd(int num) {
		int sum=0;
		if(num<=0) {
			System.out.println("summ is 0");
		}
		else {
			
			for(int i=0;i<num;i++) {
				if(i%2!=0) {
					sum +=i;
				}
			}
		}
		System.out.println(sum);

}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sumodd(num);
		
		
		
		
	}

}
