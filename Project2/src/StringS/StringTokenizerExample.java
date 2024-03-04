package StringS;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("My name is Kihsor");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2=new StringTokenizer("My name is Kihsor");
		System.out.println(st2.countTokens());
		

	}

}
 