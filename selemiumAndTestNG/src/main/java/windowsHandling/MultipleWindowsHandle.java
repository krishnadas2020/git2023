package windowsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/users/KrishnaDas/downloads/chromedriver/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/#/searchcars");
		
		String Currontwindow =driver.getWindowHandle();
		WebElement ele =driver.findElement(By.xpath("(//a[@class='submenuText'])[1]"));
		ele.click();
		
		Set<String> allWindows= driver.getWindowHandles();
		   for(String i: allWindows ) {
			if(!i.equals(Currontwindow)) {
				driver.switchTo().window(i); // for change the window 
				
				WebElement ele1= driver.findElement(By.xpath("//input[@id='search-term']"));
				ele1.sendKeys("New York");		
				
			}
		}
	}
	
	
}
