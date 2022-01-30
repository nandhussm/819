package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginOWN {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	WebElement pwd = driver.findElement(By.name("pwd"));
	WebElement loginButton = driver.findElement(By.id("loginButton"));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='admin';",username);
	jse.executeScript("arguments[0].value='manager';",pwd);
	jse.executeScript("arguments[0].click();",loginButton);
}
}
