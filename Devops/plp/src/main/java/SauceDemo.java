import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	WebElement password = driver.findElement(By.name("password"));
	WebElement loginbtn = driver.findElement(By.id("login-button"));
	
	
	username.sendKeys("visual_user");
	
	
	Thread.sleep(2000);
	password.sendKeys("secret_sauce");
	Thread.sleep(1500);
	loginbtn.click();
}
}




