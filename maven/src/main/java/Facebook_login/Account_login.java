package Facebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");

        //enter the search term in facebook
        //click the login page
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
driver.findElement(By.partialLinkText("login")).click();
driver.findElement(By.partialLinkText("log")).click();

        //driver.findElement(by)
        //enter the id and password
        //click the login button

driver.findElement(By.id("email")).sendKeys("6369851713");
driver.findElement(By.id("pass")).sendKeys("password18@@@");
driver.findElement(By.id("loginbutton")).click();
	}

}
