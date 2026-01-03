package week4.day2;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

    public static void main(String[] args) {

        // Step 1: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 2: Load the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        // Step 3: Maximize the browser
        driver.manage().window().maximize();

        // Step 4: Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 5: Switch to frame
        driver.switchTo().frame("iframeResult");

        // Step 6: Click "Try it" button
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        // Step 7: Switch to alert
        Alert alert = driver.switchTo().alert();

        // Step 8: Enter text in prompt alert
        String inputText = "Selenium";
        alert.sendKeys(inputText);

        // Choose OK or Cancel
        alert.accept();     // Click OK
        // alert.dismiss();  // Click Cancel

        // Step 9: Verify the displayed text
        String resultText = driver.findElement(By.id("demo")).getText();
        System.out.println("Displayed Text: " + resultText);

        if (resultText.contains(inputText)) {
            System.out.println("Prompt alert OK action verified successfully");
        } else if (resultText.contains("User cancelled")) {
            System.out.println("Prompt alert Cancel action verified successfully");
        } else {
            System.out.println("Prompt alert verification failed");
        }

        // Step 10: Close the browser
        driver.quit();
    }
}
