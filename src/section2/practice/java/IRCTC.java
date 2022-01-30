package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("button.btn")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@class='h_container_sm']//div[2]//i")).click();
   driver.findElement(By.xpath("//span[text()='CLOSE']")).click();
   driver.findElement(By.xpath("//label[text()='HOLIDAYS']")).click();
   
  

}
}
