package project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		try {

			driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
			Thread.sleep(1000);
			
			// 1st website
			driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
			Dimension resolution = new Dimension(1920, 1080);
			driver.manage().window().setSize(resolution);

			// Generate the filename with device name, resolution, and current date/time
            String deviceName = "Desktop";
            String resolutionString = resolution.getWidth() + "x" + resolution.getHeight();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filename = String.format("%s_%s_%s.png", deviceName, resolutionString, timestamp);

            // Take a screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot with the generated filename
            File destinationFile = new File("path/to/screenshots/" + filename);
            FileUtils.copyFile(screenshot, destinationFile);

          //move backward to previous page
			driver.manage().window().minimize();
			driver.navigate().back();
			

			// 2nd website
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/a")).click();
			resolution = new Dimension(1366,768);
			driver.manage().window().setSize(resolution);

			// Generate the filename with device name, resolution, and current date/time
            resolutionString = resolution.getWidth() + "x" + resolution.getHeight();
            timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            filename = String.format("%s_%s_%s.png", deviceName, resolutionString, timestamp);

            // Take a screenshot
            File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot with the generated filename
            File destinationFile2 = new File("path/to/screenshots/" + filename);
            FileUtils.copyFile(screenshot2, destinationFile2);

          //move backward to previous page
			driver.manage().window().minimize();
			driver.navigate().back();
			

			// 3rd website
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/a")).click();
			resolution = new Dimension(1536,864);
			driver.manage().window().setSize(resolution);

			// Generate the filename with device name, resolution, and current date/time
            resolutionString = resolution.getWidth() + "x" + resolution.getHeight();
            timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            filename = String.format("%s_%s_%s.png", deviceName, resolutionString, timestamp);

            // Take a screenshot
            File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save the screenshot with the generated filename
            File destinationFile3 = new File("path/to/screenshots/" + filename);
            FileUtils.copyFile(screenshot3, destinationFile3);

            //move backward to previous page
			driver.manage().window().minimize();
			driver.navigate().back();
			


		} catch (Exception exception) {
			driver.quit();
		}

	}

}
