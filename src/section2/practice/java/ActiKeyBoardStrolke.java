package section2.practice.java;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiKeyBoardStrolke {
            public static void main(String[] args) {
				System.setProperty("webdriver..driver" , "E:\\nan\\selenium auto\\.exe\\");
				WebDriver driver  = new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				WebElement loginbtn = driver.findElement(By.id("loginbutton"));
				File srcfile = loginbtn.getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(srcfile, new File("E:\\nan/login.jpeg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				driver.close();
				
			}
}
