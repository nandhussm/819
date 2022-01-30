package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().window().maximize();
	WebElement wb1 = driver.findElement(By.id("draggable"));
	WebElement wb2 = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	//Point p = wb2.getLocation();
	//act.dragAndDrop(wb1, wb2).perform();
	//act.dragAndDropBy(wb1, p.getX(), p.getY()).perform();
	act.clickAndHold(wb1).release(wb2).perform();
	
	
}
}
