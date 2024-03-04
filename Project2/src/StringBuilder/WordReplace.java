package StringBuilder;
import java.util.*;
public class WordReplace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//declaration of StringBuilder
		StringBuilder result=new StringBuilder();
		
		
		//if e replace with i 
		//for this is compare
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='e') {
				result.append('i');
				
			}
			else {
				result.append(str.charAt(i));
			}
		}
		
		
		System.out.println(result);
			
		
		

	}

}
