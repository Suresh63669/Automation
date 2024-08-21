package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		  ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   
// Sendkeys() AND CLICK THE ENTER BUTTON
		 
		  driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
		  

	}

}
