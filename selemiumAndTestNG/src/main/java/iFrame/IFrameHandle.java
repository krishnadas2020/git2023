package iFrame;
//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/krishnadas/Downloads/iframeexercise/FrameExample.html");
		
		driver.switchTo().frame(0);
		WebElement e =driver.findElement(By.xpath("//input[@id='b']"));
		e.sendKeys("krishna");
		//driver.switchTo().defaultContent();
		
		
//		driver.switchTo().frame(1);
//		WebElement e1 =driver.findElement(By.xpath("//input[@id='b']"));
//		e1.sendKeys("das");
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(2);
//		WebElement e2 =driver.findElement(By.xpath("//input[@id='b']"));
//		e2.sendKeys("kabbo");
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(3);
//		WebElement e3 =driver.findElement(By.xpath("//input[@id='b']"));
//		e3.sendKeys("das");

		

	}

}
