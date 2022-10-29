package implicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitHomeWork2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);// implicit wait
		
		WebElement e =driver.findElement(By.xpath("//button"));
		e.click();
		//Thread.sleep(6000);
		WebElement ele =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		ele.click();
		String s =ele.getText();
		System.out.println(s);
		

	}

}
