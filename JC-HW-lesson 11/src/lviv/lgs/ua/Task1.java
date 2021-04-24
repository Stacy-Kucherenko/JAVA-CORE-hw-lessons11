package lviv.lgs.ua;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {
	
	public static void main(String[] args) {
		
		Integer [] array1 = {1, 3, 6, 7, 10, 15, 45, 56, 76, 4, 0, 87, 65, 98, 100 };
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(array1));
		
		System.out.println("After sorting asc ");
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		System.out.println("After sorting desc ");
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println(Arrays.toString(array1));
	}

}
