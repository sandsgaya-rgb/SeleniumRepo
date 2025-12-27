package week3.day2;

import java.util.Arrays;
public class MissingElement {

		    public static void main(String[] args) {

	        // Declare and initialize array
	        int[] arr = {1, 4, 3, 2, 8, 6, 7};

	        // Sort the array
	        Arrays.sort(arr);

	        // Loop through array to find missing element
	        for (int i = 0; i < arr.length; i++) {

	            // Expected value should be i + 1
	            if (arr[i] != i + 1) {
	                System.out.println("Missing Number is: " + (i + 1));
	                break;
	            }
	        }
	    }
	}


