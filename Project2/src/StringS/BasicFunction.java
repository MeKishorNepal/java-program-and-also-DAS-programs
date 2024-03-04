package StringS;
import java.util.Scanner;
public class BasicFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName="Kishor";
		String LastName="Nepal";
		String another="Nepal";
		String fullName=firstName+""+LastName;
		System.out.println(fullName);
		//access characters of string
		for(int i=0;i<fullName.length();i++) {
			System.out.println(fullName.charAt(i));
		}
		//compare two string
		if(LastName.equals(another)) {
			System.out.println("They are equals");
		}
		else {
			System.out.println("NOt equals");
		}
		//using ==sign
		
		if(firstName==LastName) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
		//Gives incorrect answer here
		if(new String("subash")==new String("subash")) {
			System.out.println("They are same");
		}
		else {
			System.out.println("no");
		}
		//substring of a string 
		String substring=fullName.substring(0,6);
		System.out.println(substring);
		
		//concat
		String one="he";
		String two="llo";
		String third=one.concat(two);
		System.out.println(third);
		
		
		
		
				

	}

}
