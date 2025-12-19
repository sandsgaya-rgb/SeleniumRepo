package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClasss {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//load the url
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
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//lOCATE THE source field
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//instantiate the select class
		Select sel=new Select(sourceDD);
		
		sel.selectByIndex(4);
		
		//locate industry dd
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
		Select sel1=new Select(industryDD);
		
		//sel1.selectByValue("IND_INSURANCE");
		sel1.selectByVisibleText("Insurance");
		
		 WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select selectMarketing = new Select(marketingCampaignDropdown);
         selectMarketing.selectByVisibleText("Automobile");
         

         // Select Ownership by value
         WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
         Select selectOwnership = new Select(ownershipDropdown);
         selectOwnership.selectByValue("OWN_CCORP"); 

         // Click Create Lead button
         driver.findElement(By.name("submitButton")).click();
         

	}

}

