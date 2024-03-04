package Arrays;
import java.util.*;
import java.util.Arrays;

public class SortinUsingCollections {
	public static int getSmallest(Integer a[], int total) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(0);
		return element;
	}

	public static void main(String[] args) {
		Integer a[]= {43,33,67,54,34,23};
		Integer b[]= {3,2,1,4,6,7,5};
		System.out.println(getSmallest(a,6));
		System.out.println(getSmallest(b,7));

	}

}
