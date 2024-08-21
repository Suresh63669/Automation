package project;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalTest {

    public static void main(String[] args) {
        // Set up WebDriver
        ChromeDriver driver = new ChromeDriver();
		
        WebDriverWait wait = WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            // Open the DealsDray page
            driver.get("https://demo.dealsdray.com/");
            
            // Log in to the site
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-1"))).sendKeys("prexo.mis@dealsdray.com");
            driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            
            // Wait for the sidebar to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sidebar"))); // Adjust if the ID is different

            // Locate and click the "Orders" sidebar option
            WebElement ordersSidebarOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Orders')]")));
            ordersSidebarOption.click();

            // Optional: Perform additional actions after clicking "Orders"

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
           // driver.quit();
        }
    }

	private static WebDriverWait WebDriverWait(ChromeDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	public FunctionalTest(ChromeDriver driver, Duration ofSeconds) {
	}

	
}
