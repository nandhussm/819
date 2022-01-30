package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FrameHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//li//a[text()='org.openqa.selenium']")).click();
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='TakesScreenshot']")).click();
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	String text = driver.findElement(By.xpath("//h2[contains(text(),'TakesScreenshot')]")).getText();
	System.out.println(text);
     driver.close();
}
}
