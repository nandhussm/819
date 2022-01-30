package section2.practice.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewebelementHandling {
    public static void main(String[] args) {
		System.setProperty("webdriver..driver", "E:\\nan\\selenium auto\\.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("//a"));
		int count = 0;
		for(WebElement wb : links) {
			System.out.println(wb.getText());
			count++;
		}
		System.out.println(links.size());
		driver.close();
	}
}
