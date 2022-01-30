package section2.practice.java;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopupHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	
	String mainid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.numberOfWindowsToBe(4));
	
   for(String s : allid) {
	   if(!mainid.equals(s)) {
		   driver.switchTo().window(s);
		   driver.close();
	   }
   }
   driver.switchTo().window(mainid);
   WebDriverWait wait1 = new  WebDriverWait(driver,10);
   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Services'])[1]")));
   WebElement service = driver.findElement(By.xpath("(//div[text()='Services'])[1]"));
   Actions act = new Actions(driver);
   act.moveToElement(service).perform();
   WebDriverWait wait4 = new WebDriverWait(driver,10);
   wait4.until
 (ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@data-ga-track='Main Navigation Services|Marketing']"))));
   driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Services|Marketing']")).click();
   
   String mainid1 = driver.getWindowHandle();
   Set<String> allid1 = driver.getWindowHandles();
   WebDriverWait wait2 = new WebDriverWait(driver,10);
   wait.until(ExpectedConditions.numberOfWindowsToBe(2));
   for(String s1 : allid1) {
	   if(!mainid1.equals(s1)) {
		   driver.switchTo().window(s1);
		   break;
	   }
   }
   WebDriverWait wait3 = new WebDriverWait(driver,10);
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Brand Management']/../..//span)/..")));
    WebElement list = driver.findElement(By.xpath("(//a[text()='Brand Management']/../..//span)/.."));
    String s = list.getText();
     System.out.println(s);
     driver.quit();
}

}