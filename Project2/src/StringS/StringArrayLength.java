package StringS;
import java.util.*;
public class StringArrayLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		String array[]=new String[size];
		int totlength=0;
		
		//for loop to count length and enter string 
		for(int i=0;i<size;i++) {
			array[i]=sc.next();
			totlength +=array[i].length();
		}
		
		
		System.out.println("Total length of all String is "+totlength);
		
		

	}

}
