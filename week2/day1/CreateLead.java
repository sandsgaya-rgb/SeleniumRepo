package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead

{
    public static void main(String[] args) {
       
        // Instantiate the browser
        ChromeDriver driver = new ChromeDriver();

        try {
        	// Load the URL
        	
        	driver.get("http://leaftaps.com/opentaps/control/main");
        	
    		//maximize
    		driver.manage().window().maximize();
    		
    		//enter username
    		driver.findElement(By.id("username")).sendKeys("democsr2");
    		
    		//enter password
    		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    		
    		//click login
    		driver.findElement(By.className("decorativeSubmit")).click();
    		
    		//click crmsfalink
    		driver.findElement(By.partialLinkText("CRM")).click();


            // Click Leads tab
            driver.findElement(By.linkText("Leads")).click();

            // Click Create Lead button
            driver.findElement(By.linkText("Create Lead")).click();

            // Enter First Name
            driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFirstName");

            // Enter Last Name
            driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLastName");

            // Enter Company Name
            driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");

            // Enter Title
            driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lead Title");

            // Click Create Lead button
            driver.findElement(By.name("submitButton")).click();

            // Print the title of the resulting page
            System.out.println("Page Title After Creation: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
           // driver.quit();
        }
    }
}


