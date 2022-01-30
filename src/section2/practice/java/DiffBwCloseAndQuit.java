package section2.practice.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffBwCloseAndQuit {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	  		WebDriver driver = new ChromeDriver();
	  		driver.get("https://demo.actitime.com/login.do");
	  		driver.manage().window().maximize();
	  		String s = driver.getTitle();
	  		String s1 = driver.getCurrentUrl();
	  		String s2 = driver.getPageSource();
	  		System.out.println(s2);
	  		System.out.println(s1);
	  		System.out.println(s);
	  		Navigation nav = driver.navigate();
	  		nav.back();
	  		nav.forward();
	  		nav.refresh();
	  		driver.close();
	}
}
