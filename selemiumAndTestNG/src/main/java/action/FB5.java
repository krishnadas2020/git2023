package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FB5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//implecit wait used after this three line 
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		we.click();
		act.perform();
		
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,10);  // object created 
		By locator = By.xpath("//input[@name='firstname']");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));//// conditions been used here 
		
	    WebElement fName=driver.findElement(locator);
		act.sendKeys(fName,"krishna");
		act.perform();
		
		

}
}