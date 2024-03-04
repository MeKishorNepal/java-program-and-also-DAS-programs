package BitManipulation;
import java.util.*;
public class ClearBit {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=2;
		int bitmask=1<<pos;
		int notbitmask=~(bitmask);
		
		int newNumber=notbitmask&n;
		System.out.println(newNumber);
		

	}

}
