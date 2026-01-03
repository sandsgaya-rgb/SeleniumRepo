package week4.day2;


	import java.util.LinkedHashSet;
	import java.util.Set;

	public class SetInterface 
	{

	    public static void main(String[] args) {

	        // Given String
	        String companyName = "google";

	        // Create Set to store unique characters (maintains order)
	        Set<Character> uniqueChars = new LinkedHashSet<Character>();

	        // Convert string to character array and add to Set
	        for (char ch : companyName.toCharArray()) {
	            uniqueChars.add(ch);
	        }

	        // Print unique characters
	        System.out.print("Unique characters: ");
	        for (char ch : uniqueChars)
	        {
	            System.out.print(ch);
	        }
	    }
	}


