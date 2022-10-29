package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		we.click();
		act.perform();
		
		WebElement fName=driver.findElement(By.xpath("//input[@name='firstname']"));
		act.sendKeys(fName,"krishna");
		act.perform();
		
		WebElement LName=driver.findElement(By.xpath("//input[@name='lastname']"));
		act.sendKeys(LName,"das");
		act.perform();
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'u_2_g_9h')]"));
		act.sendKeys(email,"daskrishnabd");
		act.perform();
		
		WebElement password=driver.findElement(By.xpath("//input[contains(@id,'u_2_g_9h')]"));
		act.sendKeys(password,"das2345");
		act.perform();
		
		
		
	}

}
