package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsAutomation {
    public static void main(String[] args) {
        
        // Instantiate ChromeDriver
        ChromeDriver driver=new ChromeDriver();
		//load the url
		
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


            // Click Accounts tab
            driver.findElement(By.linkText("Accounts")).click();

            // Click Create Account
            driver.findElement(By.linkText("Create Account")).click();

            // Enter Account Name
            driver.findElement(By.id("accountName")).sendKeys("TestAutomationAccount");

            // Enter Description
            driver.findElement(By.name("description"))
                  .sendKeys("Selenium Automation Tester.");

            // Enter Number of Employees
            WebElement employeesField = driver.findElement(By.id("numberEmployees"));
            employeesField.sendKeys("100");

            // Enter Site Name
            driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

            
            // Click Create Account button at bottom
            driver.findElement(By.xpath("//input[@value='Create Account']")).click();

            // Print the Title of resulting page
            String pageTitle = driver.getTitle();
            System.out.println("Page Title After Account Creation: " + pageTitle);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
          //  driver.quit();
        }
    }
}
