package week4.day2;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Myntra
	{

	    public static void main(String[] args) throws InterruptedException 
	    {

	        // Step 1: Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Step 2: Load the URL
	        driver.get("https://www.ajio.com");

	        // Step 3: Maximize browser
	        driver.manage().window().maximize();

	        // Step 4: Add implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Step 5: Search for "bags"
	        driver.findElement(By.name("searchVal")).sendKeys("bags");
	        driver.findElement(By.className("ic-search")).click();

	        // Small wait for results to load
	        Thread.sleep(3000);

	        // Step 6: Click on "Men" under Gender filter
	        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();

	        Thread.sleep(3000);

	        // Step 7: Print count of items found
	        String itemCount = driver.findElement(By.className("length")).getText();
	        System.out.println("Items Found: " + itemCount);

	        // Step 8: Get list of brands
	        List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
	        System.out.println("\nList of Brands:");

	        for (WebElement brand : brandList) {
	            System.out.println(brand.getText());
	        }

	        // Step 9: Get list of bag names
	        List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
	        System.out.println("\nList of Bag Names:");

	        for (WebElement bag : bagNames) {
	            System.out.println(bag.getText());
	        }

	       	    }
	}

