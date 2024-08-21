package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Demo {

    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set the correct path to your chromedriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
            driver.quit();
        }
    }
}
