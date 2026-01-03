package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort
{

    public static void main(String[] args) {

        // Step 1: Declare String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Step 2: Add array to List
        List<String> companyList = new ArrayList<String>(Arrays.asList(companies));

        // Step 3: Sort the list in ascending order
        Collections.sort(companyList);

        // Step 4: Iterate using reverse loop
        System.out.println("Required Output:");
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.println(companyList.get(i));
        }
    }
}
