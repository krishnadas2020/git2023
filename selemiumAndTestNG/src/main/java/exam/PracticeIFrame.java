package exam;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIFrame {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tinymce");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		ele.clear();
		ele.sendKeys("we are facing exam");
		driver.switchTo().defaultContent();
		
		
		WebElement e =driver.findElement(By.xpath("//span[@class='tox-tbtn__select-label']"));
		e.click();
		
		WebElement e1= driver.findElement(By.xpath("//div[@class='tox-collection__item-label']"));
		e1.click();
		
		WebElement e2= driver.findElement(By.xpath("//div[@title='Heading 1']"));
		e2.click();
		
		
		WebElement e3 =driver.findElement(By.xpath("//span[@class='tox-tbtn__select-label']"));
		e3.click();

		WebElement e4= driver.findElement(By.xpath("//div[text()='Align']"));
		e4.click();
		
		WebElement e5= driver.findElement(By.xpath("//div[text()='Right']"));
		e5.click();
		
        TakesScreenshot tc =(TakesScreenshot)driver;
	    
        File src = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot/photo1.png");
        FileUtils.copyFile(src, dest);
        
        driver.switchTo().frame(0);
        List<WebElement> ele6 = driver.findElements(By.xpath("//div[@class='tox-collection_group'])[2]"));
       for(WebElement value: ele6) {
    	   String s=value.getText();
    	   System.out.println(s);
       }
        
        
        //String s= ele6.getText();
       //System.out.println(s);
       
	}

}
