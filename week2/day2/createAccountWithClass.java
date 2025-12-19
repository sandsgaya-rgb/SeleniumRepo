package week2.day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class createAccountWithClass
	{
    public static void main(String[] args) 
    {

        // 1. Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // 2. Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // 3. Maximize the browser
        driver.manage().window().maximize();

        // 4. Enter username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // 5. Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // 6. Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // 7. Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // 8. Click Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        // 9. Click Create Account
        driver.findElement(By.linkText("Create Account")).click();

        // 10. Enter Account Name
      
        driver.findElement(By.id("accountName")).sendKeys("Automation Account");

        // 11. Enter Description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        // 12. Select Industry - ComputerSoftware
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
       
        Select industry = new Select(industryDropdown);
        
        industry.selectByVisibleText("ComputerSoftware");
        // 13. Select Ownership - S-Corporation
        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(ownershipDropdown);
        ownership.selectByVisibleText("S-Corporation");

        // 14. Select Source - Employee
        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(sourceDropdown);
        source.selectByValue("LEAD_EMPLOYEE");

        // 15. Select Marketing Campaign - by Index
        WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
        Select marketing = new Select(marketingDropdown);
        marketing.selectByIndex(6);

        // 16. Select State - Texas
        WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(stateDropdown);
        state.selectByValue("TX");

        // 17. Click Create Account button
        driver.findElement(By.className("smallSubmit")).click();
       

         }
}
