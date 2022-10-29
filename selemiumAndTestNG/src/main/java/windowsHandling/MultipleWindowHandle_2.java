package windowsHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandle_2 {
	
	public  static void main(String[]args) {
     System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
     WebDriver driver = new ChromeDriver();
    driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   String firsttab = driver.getWindowHandle();

    WebElement c = driver.findElement(By.xpath("//a[text()='Things to do']"));
      c.click();
      
           String secondWindow="";
            Set<String> twotabs = driver.getWindowHandles();
             for (String secondtab : twotabs) {
             if (!secondtab.equals(firsttab)) {
	
                  secondWindow=secondtab;
               driver.switchTo().window(secondWindow);



                        //Actions act = new Actions(driver);


        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("New York");
      //act.sendKeys(search, "New York");
      //act.perform();
      
      }
         }
         
         
      driver.switchTo().window(firsttab);

       WebElement c1 = driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
                  c1.click();

         Set<String> all = driver.getWindowHandles();

         for(String thirdtab : all) {
                   //if(!thirdtab.equals(twotabs)) {
               if(!(thirdtab.equals(firsttab) && thirdtab.equals(secondWindow))) {

                  driver.switchTo().window(thirdtab);

}
}
              WebElement destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
              destination.sendKeys("queens");
             

}

          //driver.close(); - specific tab/window
          //driver.quit(); - everything closed or whole window



}

