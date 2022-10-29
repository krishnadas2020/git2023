package explicit;

// Q:go to this webSite http://the-internet.herokuapp.com/dynamic_loading/2
// print out hello world in the console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHomeWork2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement e =driver.findElement(By.xpath("//button"));
		e.click();
		//Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
//		By locator = By.xpath("//h4[text()='Hello World!']");
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
//	WebElement e1=driver.findElement(locator);
//	String s =e1.getText();
//		System.out.println(s);
		driver.quit();
			}
}
