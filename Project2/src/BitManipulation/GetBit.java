package BitManipulation;
import java.util.*;
public class GetBit {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=3;
		int BitMask=1<<pos;
		
		if((BitMask&n)==0) {
			System.out.println("The bit is Zero");
		}
		else {
			System.out.println("The bit is one");
		}
		
	}

}
