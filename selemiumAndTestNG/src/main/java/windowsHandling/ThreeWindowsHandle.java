package windowsHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeWindowsHandle {
	
	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "/users/KrishnaDas/downloads/chromedriver");
	     WebDriver driver = new ChromeDriver();
	    driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    String firstWindow =driver.getWindowHandle();
	    System.out.println(firstWindow);
	    
	    WebElement element =driver.findElement(By.xpath("//a[text()='Things to do']"));
	    element.click();
	    
	  String window="";
	    Set<String> multipleWindows=driver.getWindowHandles();
	    for(String secondWindow:multipleWindows) {
	    	if(!secondWindow.equals(firstWindow)) {
	    		window=secondWindow;
	    	driver.switchTo().window(window);  
	    	
	    	   WebElement element1= driver.findElement(By.xpath("//input[@id='search-term']"));
	   element1.sendKeys("New work");
	    	}
	    }
	    
			driver.switchTo().window(firstWindow);
			WebElement element2= driver.findElement(By.xpath("//input[@placeholder='Pick-up location']"));
			   element2.sendKeys("queens");	
			   
			   WebElement element3= driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
			   element3.click();
			
			Set<String> multipleWindow=driver.getWindowHandles();
			for(String thirdWindow : multipleWindow) {
				if(!(thirdWindow.equals(firstWindow) && thirdWindow.equals(window))) {
					driver.switchTo().window(thirdWindow);
					
					
//					 WebElement destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
//		              destination.sendKeys("queens");
					
			}	
			}
			 WebElement destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
             destination.sendKeys("queens");
	
	
}	

}
