package week4day1assgin;


	import java.util.ArrayList;
	import java.util.List;

	public class FindIntersect {

	    public static void main(String[] args) {

	        // Declare arrays
	        int[] array1 = {3, 2, 11, 4, 6, 7};
	        int[] array2 = {1, 2, 8, 4, 9, 7};

	        // Create Lists
	        List<Integer> list1 = new ArrayList<Integer>();
	        List<Integer> list2 = new ArrayList<Integer>();

	        // Add array elements to lists
	        for (int num : array1) {
	            list1.add(num);
	        }

	        for (int num : array2) {
	            list2.add(num);
	        }

	        // Compare lists and print common elements
	        System.out.println("Common elements are:");
	        for (Integer value : list1) {
	            if (list2.contains(value)) {
	                System.out.println(value);
	            }
	        }
	    }
	}

