package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additional_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   
//clear()
		  
		  // driver.findElement(By.name("q")).sendKeys("amazon");
		  // driver.findElement(By.name("q")).clear();
		   
		   
//click() AND close()
		   //driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
		   //driver.findElement(By.partialLinkText("Shop online at Amazon India")).click();
		   //driver.close();
	
//quit()
		   //driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
		   //driver.findElement(By.partialLinkText("Shop online at Amazon India")).click();
		   //driver.quit();
		   
//minimize() AND maximize()
		   
		   driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
		   driver.findElement(By.partialLinkText("Shop online at Amazon India")).click();
		   driver.manage().window().maximize();
		   driver.manage().window().minimize();
		   
	}

}
