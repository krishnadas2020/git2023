package implicit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //implecit wait
		
	//WebElement cookis=driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
				//cookis.click();
		
		WebElement ele=driver.findElement(By.xpath("(//a[@href='#'])[12]"));
		ele.click(); 
		
		WebElement ele1 =driver.findElement(By.xpath("//span[@class='label']"));
		String s= ele1.getText();
		System.out.println(s);
		//Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //implecit wait
		WebElement ele2=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		ele2.click();
		 

	}

}
