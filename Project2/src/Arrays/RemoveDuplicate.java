package Arrays;
import java.util.*;
public class RemoveDuplicate {
	public static int removeDuplicatElement(int arr[],int n){
		if(n==0|| n==1) {
			return n;
		}
        HashSet<Integer> uniqueElements = new HashSet<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (!uniqueElements.contains(arr[i])) {
                arr[j++] = arr[i];
                uniqueElements.add(arr[i]);
            }
        }

        return j;

       
	}

	
	public static void main(String[] args) {
		int arr[]= {2,3,3,2,1,5,4,4,3};
		int length=arr.length;
		System.out.println("Original Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        length = removeDuplicatElement(arr, length);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

		
		
		
		}
	}
