package windowsHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unlimited_WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/KrishnaDas/downloads/chromedriver");
	     WebDriver driver = new ChromeDriver();
	    driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String firstWindow =driver.getWindowHandle();
	    
	    WebElement element =driver.findElement(By.xpath("//a[text()='Things to do']"));
	    element.click();

	    String secondWindow=""; // set<string> covert to string here
	    Set<String> windows =driver.getWindowHandles();
	    for(String secondW :windows ) {
	    	if(!secondW.equals(firstWindow)) {
	    		secondWindow=secondW;
	    		driver.switchTo().window(secondWindow);
	    		
	    		 WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
	    	        search.sendKeys("New York");
	    	 	}  	
	    }
	    driver.switchTo().window(firstWindow);
	    WebElement c1 = driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
        c1.click();
        
        String thirdWindow="";
        Set<String> multipleWindows =driver.getWindowHandles();
        for(String third: multipleWindows ) {
        	thirdWindow=third;
        	if(!(thirdWindow.equals(firstWindow) && thirdWindow.equals(secondWindow))) {
        		driver.switchTo().window(thirdWindow);
        		
        		  
        	}
        }
        WebElement destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
        destination.sendKeys("bronx");
	
	    driver.switchTo().window(secondWindow);
	    WebElement cancel = driver.findElement(By.xpath("//button[@class='btn ico-btn-cancelTrip']"));
	    cancel.click();
	    
	    driver.switchTo().window(firstWindow);
	    WebElement list = driver.findElement(By.xpath("//a[text()='List your property']"));
	    list.click();
	    
	    String fourthWindows="";
	    Set<String> listOfWindows= driver.getWindowHandles();
	    for(String fourth: listOfWindows ) {
	    	fourthWindows=fourth;
	    	if(!(fourthWindows.equals(firstWindow)&& fourthWindows.equals(secondWindow)&& fourthWindows.equals(thirdWindow))) {
	    		driver.switchTo().window(fourthWindows);
	    		
	    		 WebElement list2 = driver.findElement(By.xpath("(//span[text()='List your property'])[2]"));
	    		    list2.click();
	    		
	    	}
	    }
	    
	    
	    
	    
	    
	    
	}
}
