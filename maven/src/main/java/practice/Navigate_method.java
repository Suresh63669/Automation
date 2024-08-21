package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		
//get() TO RELOAD AND REFRESH A WEB PAGE
		
		 //d.get("https://www.google.com/");
		
//navigete() TO MOVING BACKWARD IN BROWSING HISTORY
		
		   d.navigate().to("https://www.google.com/");
		   d.navigate().back();
		   String pagetitle=d.getTitle();
		   String pageurl=d.getCurrentUrl();
		   System.out.println("After moving backward in history");
		   System.out.println("Title :"+pagetitle+"Url :"+pageurl);
		   
//navigete() TO MOVING BACKWARD IN BROWSING HISTORY
			
		   d.navigate().to("https://www.google.com/");
		   d.navigate().forward();
		   String pagetitle1=d.getTitle();
		   String pageurl1=d.getCurrentUrl();
		   System.out.println("After moving forward in history");
		   System.out.println("Title :"+pagetitle1+"Url :"+pageurl1);
		   
		   
	}

}
