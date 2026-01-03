package week4day1assgin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement
{

    public static void main(String[] args)
    {

        // Step 1: Declare array
        int[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Add array elements to List
        List<Integer> numbers = new ArrayList<Integer>();

        for (int num : arr)
        {
            numbers.add(num);
        }

        // Step 3: Sort the list in ascending order
        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);
        System.out.println("Missing Numbers:");

        // Step 4: Check for gaps in the sequence
        for (int i = 0; i < numbers.size() - 1; i++) 
        {
            int current = numbers.get(i);
            int next = numbers.get(i + 1);

            // Step 5: Detect missing numbers
            if (current + 1 != next)
            {
                for (int missing = current + 1; missing < next; missing++) 
                {
                    System.out.println(missing);
                }
            }
        }
    }
}
