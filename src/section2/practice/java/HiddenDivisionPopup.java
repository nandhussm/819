package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("container_tasks")).click();
	
	driver.findElement(By.xpath("(//div[@class='img']/../..)[2][3]")).click();
	driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click(); 
	//WebDriverWait wait =  new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy.xpath(("(//div[@class='operationConfirmDialogInnerContainer']/..//div[@class='title'])[3]"));
   WebElement title =    driver.findElement
	(By.xpath("(//div[@class='operationConfirmDialogInnerContainer']/..//div[@class='title'])[3]"));
	String title1  =title.getText();
	System.out.println(title1);
	
	
	

}
}
