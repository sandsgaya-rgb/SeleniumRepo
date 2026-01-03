package week4.day2;

	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FramesTest {

	    public static void main(String[] args) {

	        // Step 1: Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Step 2: Load the URL
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

	        // Step 3: Maximize browser window
	        driver.manage().window().maximize();

	        // Step 4: Add implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Step 5: Switch to iframe
	        driver.switchTo().frame("iframeResult");

	        // Step 6: Click "Try it" button
	        driver.findElement(By.xpath("//button[text()='Try it']")).click();

	        // Step 7: Switch to alert
	        Alert alert = driver.switchTo().alert();

	        // Choose OK or Cancel
	        alert.accept();   // Click OK
	        // alert.dismiss(); // Click Cancel

	     // Step 8: Verify the displayed text
	        String resultText = driver.findElement(By.id("demo")).getText();
	        System.out.println("Displayed Text: " + resultText);

	        if (resultText.contains("OK")) {
	            System.out.println("OK button clicked successfully");
	        } else if (resultText.contains("Cancel")) {
	            System.out.println("Cancel button clicked successfully");
	        } else {
	            System.out.println("Alert action verification failed");
	        }

	        // Step 9: Close browser
	        driver.quit();
	    }
	}