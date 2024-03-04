package StringBuilder;
import java.util.*;
public class CombineLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		//Declaration of StringBuilder 
		StringBuilder sb=new StringBuilder();
		
		int totlength=0;
		
		//for loop to scann all the string and 
		//calculate length
		for(int i=0;i<size;i++) {
			String str=sc.next();
			sb.append(str);
			}
		totlength +=sb.length();
		
		
		System.out.println(totlength);
		
	}

}
