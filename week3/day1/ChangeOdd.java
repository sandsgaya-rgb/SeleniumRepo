package week3.day1;

public class ChangeOdd {

    public static void main(String[] args)
    {

        String test = "changeme";

        // Convert String to character array
        char[] charArray = test.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--)
        {

            // Check if index is odd
            if (i % 2 != 0) 
            {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        for (char c : charArray) {
            System.out.print(c);
        }
    }
}


