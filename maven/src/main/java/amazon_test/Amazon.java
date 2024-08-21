package amazon_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver. get("https://www.amazon.in/");


		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Iphone 15 pro max");


		driver.findElement(By.id("nav-search-submit-text")).click();

		driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Black Titanium")).click();
		
		
		
	

	}

}
