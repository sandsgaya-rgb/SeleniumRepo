package week3.day1;

public class ReverseString {
	
	

	    public static void main(String[] args) {

	        String companyName = "TestLeaf";

	        // Convert String to character array
	        char[] charArray = companyName.toCharArray();

	        // Loop from end to start and print characters
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            System.out.print(charArray[i]);
	        }
	    }
	}


