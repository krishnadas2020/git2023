package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tinymce");
		
		
		

		//driver.switchTo().frame(1);
		WebElement e =driver.findElement(By.xpath("//span[@class='tox-tbtn__select-label']"));
		//e.clear();
		//e.sendKeys("krishna");
		e.click();
		
		WebElement e1= driver.findElement(By.xpath("//div[@class='tox-collection__item-label']"));
		e1.click();
		
		WebElement e2= driver.findElement(By.xpath("//div[@title='Heading 1']"));
	e2.click();
//		
		WebElement e3= driver.findElement(By.xpath("//div[text()='Align']"));
		e3.click();
//		
//		WebElement e4= driver.findElement(By.xpath("//div[text()='Right']"));
//		e4.click();
//		
		
		

	}

}
