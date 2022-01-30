package section2.practice.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver..driver", "E:\\nan\\selenium auto\\.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		for(WebElement wb : suggestion) {
	       String s =  wb.getText();
		
		if(s.equals("selenium tutorial")) {
	      wb.click();
	      break;
	    	
	     }
		
		}
		driver.close();	
    }
}


