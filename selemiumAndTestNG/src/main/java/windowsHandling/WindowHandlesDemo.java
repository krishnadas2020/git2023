package windowsHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/#/searchcars");
		
		String handle=driver.getWindowHandle();
		WebElement ele =driver.findElement(By.xpath("//a[text()='Things to do']"));
		ele.click();
		System.out.println(handle);
		
		Set<String> handles= driver.getWindowHandles(); // which is return set of string 
		ArrayList<String> allWindows = new ArrayList<String>(handles);// converted to ArrayList
		System.out.println(allWindows);
		
		
		
		//Thread.sleep(5000);
		driver.switchTo().window(allWindows.get(1));// child window 1
		WebElement ele1 =driver.findElement(By.xpath("//input[@id='search-term']"));
		ele1.sendKeys("new york");
		//driver.close();
		
		driver.switchTo().window(allWindows.get(0));// parent window
		WebElement ele2 =driver.findElement(By.xpath("//input[@id='pickupLocation']"));
		ele2.sendKeys("new york");
		
		WebElement ele3=driver.findElement(By.xpath("(//a[@class='submenuText'])[3]"));
		ele3.click();
		
		
		
		
		driver.switchTo().window(allWindows.get(2));   // child windown 2
        WebElement ele4 =driver.findElement(By.xpath("//input[@name='Destination1Text']"));
	    ele4.sendKeys("new york");
  		
		
		
		
		
		
		

	}

}
