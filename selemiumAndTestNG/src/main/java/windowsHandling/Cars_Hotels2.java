package windowsHandling;
import java.util.Set;
//mport java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cars_Hotels2 {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/#/searchcars");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String currentWindow =driver.getWindowHandle();
		WebElement e =driver.findElement(By.xpath("//a[text()='Things to do']"));
		e.click();
		 
		Set<String> all=driver.getWindowHandles();
		for(String i :all) {
			if(!i.equals(currentWindow)) {
				driver.switchTo().window(i);
				
				WebElement e1 =driver.findElement(By.xpath("//input[@id='search-term']"));
				e1.sendKeys("New York");		
							
			}
		}
		Set<String> all1=driver.getWindowHandles();
		for(String secondwindow :all1) {
			if(secondwindow.equals(currentWindow)) {
				driver.switchTo().window(secondwindow);
		
		WebElement e1 =driver.findElement(By.xpath("//input[@id='pickupLocation']"));
		e1.sendKeys("New York");
	
		
		WebElement e2=driver.findElement(By.xpath("(//a[@class='submenuText'])[3]"));
		e2.click();
				
	} 			
}
//		Set<String> all2=driver.getWindowHandles();
//		for(String trirdwindow :all2) {
//			if(!trirdwindow.equals(all)) && trirdwindow.equals(secondwindow)))
//			 {
//				driver.switchTo().window(i);
		
}
}