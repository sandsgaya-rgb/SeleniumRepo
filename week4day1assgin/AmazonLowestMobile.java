package week4day1assgin;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLowestMobile
{

	public static void main(String[] args) 
	
    {

        // 1) Launch the Browser
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        

        // 2) Navigate to amazon.in
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3) Search for phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

       
        // 4) Capture all phone prices using common XPath
        List<WebElement> priceElements =driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        // 5) Store prices in a List
        List<Integer> prices = new ArrayList<Integer>();

        for (WebElement price : priceElements) 
        {
            String text = price.getText().replace(",", "");
            if (!text.isEmpty())
            {
                prices.add(Integer.parseInt(text));
            }
        }

        // 6) Sort the prices in ascending order
        Collections.sort(prices);

        // 7) Print the lowest price
        System.out.println("Lowest Mobile Price on Amazon: ₹" + prices.get(0));

            }
}
