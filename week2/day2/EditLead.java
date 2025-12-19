package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

    public static void main(String[] args) {

        // Precondition 1: Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Precondition 2: Load URL
        driver.get("http://leaftaps.com/opentaps/");

        // Precondition 3: Maximize browser
        driver.manage().window().maximize();

        

        // Step 1: Enter Username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Step 2: Enter Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Step 3: Click Login
        driver.findElement(By.className("decorativeSubmit")).click();

        // Step 4: Click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Leads")).click();
        
		  //Click on Create Lead
		  driver.findElement(By.linkText("Create Lead")).click();
		  
		  //Enter the CompanyName Field Using Xpath
		  
		  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Company Name");
		  
		  //Enter the FirstName Field Using Xpath
		  driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("First Name");
		  
		  //Enter the LastName Field Using Xpath.
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Last Name");
		  
		  //Enter the FirstName (Local) Field Using Xpath.
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Local Firstname");
		  
		  //Enter the Department Field Using any Locator of Your Choice.
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department");
		  
		  //Enter the Description Field Using any Locator of your choice.
		  driver.findElement(By.name("description")).sendKeys("Description 12333");
		  
		  //Enter your email in the E-mail address Field using the locator of your choice.
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		  
		  //Select State/Province as NewYork Using Visible Text.
        WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select selstate=new Select(State);
        selstate.selectByVisibleText("New York");
        
        //Click on the Create Button
        driver.findElement(By.name("submitButton")).click();
        
        //Click on the edit button
        driver.findElement(By.linkText("Edit")).click();
        
        //Clear the Description Field.
        driver.findElement(By.name("description")).clear();
        
        //Fill the Important Note Field with Any text
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Notes ABCD EFGHIJK");
        
        //Click on the update button
        driver.findElement(By.name("submitButton")).click();
        
        //Get the Title of the Resulting Page
        System.out.println(driver.getTitle());
        //driver.close();                
       

        // Step 21: Close Browser
     //   driver.quit();
    }
}



