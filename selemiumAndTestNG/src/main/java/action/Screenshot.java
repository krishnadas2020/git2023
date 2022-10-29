package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();// by using this line i will able to get full page 
		
		//webdriver is interface and takescreenshot also a interface so one interface variable is not allow.. 
		// webdriver variable can not hold takescreenshot variable.. takescreenshot variable cant hold webdriver
		//instance , thats the reason we have type cast the webdriver varibale to takescreenshot variable
		TakesScreenshot screen = (TakesScreenshot)driver; //to perform the type casting we need to same interface
		
		
		//this method will capture the screenshot somewhere in the memory or hard dish 
		//but we don't know the location 
		File src= screen.getScreenshotAs(OutputType.FILE);// this method file return file objects
        File target =new File("screenshot/photo.pnj");// created my own loaction;
        FileUtils.copyFile(src, target);
	}

}
