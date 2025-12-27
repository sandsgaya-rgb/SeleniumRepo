package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

    public static void main(String[] args) {

        // Initialize WebDriver
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize the browser
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter mandatory fields
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandy");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karan");

        
        WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select source = new Select(sourceDD);
        source.selectByIndex(4);

        // Select Automobile in Marketing Campaign using visible text
        WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select marketing = new Select(marketingDD);
        marketing.selectByVisibleText("Automobile");

        // Select Corporation in Ownership using value
        WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select ownership = new Select(ownershipDD);
        ownership.selectByValue("OWN_CCORP");

        // Click Create Lead button
        driver.findElement(By.className("smallSubmit")).click();

        // Verify page title
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        if (title.contains("View Lead"))
        {
            System.out.println("Lead created successfully");
        } else {
            System.out.println("Lead creation failed");
        }

        // Close browser
      //  driver.close();
    }
}
