package amazon_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Shop online at Amazon")).click();

		WebElement SearchBox =  driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Redmi"+Keys.ENTER);
	}

}
