package section2.practice.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadingByUsingRobotClass {
public static void main(String[] args) throws AWTException {
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
	
	Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	
	
	StringSelection path = new StringSelection("F:\\resum\\NANDHU RESME-3.docx");
	
	cb.setContents(path, null);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
}
