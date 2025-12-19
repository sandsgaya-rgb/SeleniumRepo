package week2.day2;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	public class LaunchFacebook {
	
	    public static void main(String[] args) {
	        
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.id("email")).sendKeys("sands.gaya@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Krithiyaa@01");
	        driver.manage().window().maximize();
	        
	      
	        		// Step 5: Click on Create New Account
	                driver.findElement(By.xpath("//a[text()='Create new account']")).click();

	                // Step 6: Enter First Name
	                driver.findElement(By.name("firstname")).sendKeys("Sandhya");

	                // Step 7: Enter Surname
	                driver.findElement(By.name("lastname")).sendKeys("Karan");

	                // Step 8: Enter Mobile number or Email
	                driver.findElement(By.name("reg_email__")).sendKeys("9876543210");

	                // Step 9: Enter New Password
	                driver.findElement(By.id("password_step_input")).sendKeys("Test@12345");

	                // Step 10: Handle Date of Birth dropdowns using Select class

	                // Day dropdown
	                WebElement day = driver.findElement(By.id("day"));
	                Select selectDay = new Select(day);
	                selectDay.selectByVisibleText("15");

	                // Month dropdown
	                WebElement month = driver.findElement(By.id("month"));
	                Select selectMonth = new Select(month);
	                selectMonth.selectByVisibleText("Aug");

	                // Year dropdown
	                WebElement year = driver.findElement(By.id("year"));
	                Select selectYear = new Select(year);
	                selectYear.selectByVisibleText("1995");

	                // Step 11: Select Gender radio button (Female)
	                driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

	                driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	                // Optional: Close browser
	                // driver.quit();
	            }
	        

	    }
	

