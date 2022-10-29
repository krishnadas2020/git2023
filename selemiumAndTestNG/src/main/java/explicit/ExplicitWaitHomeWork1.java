package explicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitHomeWork1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		WebDriverWait wait = new WebDriverWait(driver,15);// onjects has created for WebDriverWait
		By locator1 = By.xpath("//a[text()='12']");
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		WebElement ele=driver.findElement(locator1);
		ele.click();
		
		WebElement ele1 =driver.findElement(By.xpath("//span[@class='label']"));
		String s= ele1.getText();
		System.out.println(s);
		
		
		By locator =By.xpath("//button[@id='onetrust-accept-btn-handler']"); //handling cookies 
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement cookis=driver.findElement(locator);
		cookis.click(); 

	}

}
