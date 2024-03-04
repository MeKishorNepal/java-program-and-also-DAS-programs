package BitManipulation;
import java.util.*;
public class UpdateForOne {

	public static void main(String[] args) {
		//setBit Operation
		//0->>1 update
		int n=5;//0101
		int pos=1;
		int bitmask=1<<pos;
		
		int newNumber=bitmask|n;
		System.out.println(newNumber);
		
		
		
		//1->0 update
		//clear bit operation
		int m=6;//0110
		int pos1=1;
		int bitMask=1<<pos1;
		int notbitMask=~(bitMask);
		
		int number=notbitMask&m;
		System.out.println(number);
		

	}

}
