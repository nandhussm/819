package section2.practice.java;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWait {
      public static void main(String[] args) {
     System.setProperty("webdriver..driver", "E:\\nan\\selenium auto\\.exe\\");
  		WebDriver driver = new ChromeDriver();
  	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		driver.get("https://demo.actitime.com/login.do");
  		driver.manage().window().maximize();
  		driver.findElement(By.id("username")).sendKeys("admin");
  		driver.findElement(By.name("pwd")).sendKeys("manager");
  		driver.findElement(By.id("loginButton")).click();
  		WebDriverWait wait = new WebDriverWait(driver ,10);
  	    
  	    System.out.println(driver.getTitle());
  		
  		driver.findElement(By.id("container_tasks")).click();
  		
  		
  		driver.findElement(By.id("container_users")).click();
  		
  		
	}
}

      
