package FunctionProg;
import java.util.*;
public class age {
	public static void checkage(int age) {
		if(age<18) {
			System.out.println("You are not eligible for vote");
			
		}
		else {
			System.out.println("You are eligible for vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		checkage(age);
	}

}
