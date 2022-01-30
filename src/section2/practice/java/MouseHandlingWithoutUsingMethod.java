package section2.practice.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlingWithoutUsingMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("username"));
	WebElement pwd = driver.findElement(By.name("pwd"));
	WebElement login = driver.findElement(By.id("loginButton"));
	
	Actions act = new Actions(driver);
	act.sendKeys(user , "admin").perform();
	act.sendKeys(pwd , "manager").perform();
	act.click(login).perform();
}
}
