package section2.practice.java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringUrlAndURL {
public static void main(String[] args) throws MalformedURLException {
	 System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
	   //	driver.navigate().to("https://demo.actitime.com/login.do");
		URL url = new URL("https://demo.actitime.com/login.do");
		driver.navigate().to(url);
}
}
