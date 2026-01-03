package week4day1assgin;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class SecondLargest {

	    public static void main(String[] args) {

	        // Declare the array
	        int[] arr = {3, 2, 11, 4, 6, 7};

	        // Create a List
	        List<Integer> numbers = new ArrayList<Integer>();

	        // Add array elements to the List
	        for (int num : arr) {
	            numbers.add(num);
	        }

	        // Sort the List in ascending order
	        Collections.sort(numbers);

	        // Get the second largest number
	        int secondLargest = numbers.get(numbers.size() - 2);

	        // Print the result
	        System.out.println("Second largest number is: " + secondLargest);
	    }
	}


