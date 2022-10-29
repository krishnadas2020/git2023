package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/krishnadas/Downloads/alert.html");
		
		WebElement e=driver.findElement(By.xpath("//button[@id='js_alert']"));
		e.click();
		
		Alert alt =driver.switchTo().alert();
		String t =alt.getText();
		System.out.println(t);
		
		//alt.accept();// ok or yes
		
		alt.dismiss();// no

	}

}
