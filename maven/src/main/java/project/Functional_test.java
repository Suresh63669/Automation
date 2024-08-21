package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Functional_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 
		 // navigate to the webpage
		 driver.get("https://demo.dealsdray.com/");
		 
		 //enter the username and password and click the login button
		 
		 driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
         driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         
         
         
         
        
        		 }
}
