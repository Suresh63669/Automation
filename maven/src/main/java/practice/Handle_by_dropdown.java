package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_by_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ChromeDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/radio.html");
	      Select s1 =new Select(driver.findElement(By.className("dropdown-toggle")));
	      
//BY intex
	      
	      s1.selectByIndex(3);
	      
//BY VALUE
	      
	      //s1.selectByValue("3");
	      
	         
	      
	}

}
