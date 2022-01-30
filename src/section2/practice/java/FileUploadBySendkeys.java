package section2.practice.java;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadBySendkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for(String s : allid) {
			if(!mainid.equals(s)) {
				driver.switchTo().window(s);
				driver.close();
			}
	 	}
		driver.switchTo().window(mainid);
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		
		driver.findElement(By.id("file_upload")).sendKeys("F:\\resum\\NANDHU RESME-3.docx");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("file_upload")));
	    driver.close();
	}
	
	
}

