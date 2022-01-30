package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement wb = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement
	(By.xpath("(//li[@class='desktop-oddColumnContent']//a[text()='Sports Shoes'])[1]")).click();		
	}
}
