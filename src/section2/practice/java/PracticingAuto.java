package section2.practice.java;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


public class PracticingAuto {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		WebElement daylist = driver.findElement(By.id("day"));
		Select s = new Select(daylist);
		s.selectByIndex(12);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		Select s1 = new Select(monthlist);
		s1.selectByVisibleText("Mar");
		
		
		
		
		
		//driver.close();
		
   	
}
}
