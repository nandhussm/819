package section2.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Alert alt = driver.switchTo().alert();
	String jsalert = alt.getText();
	if(jsalert.equals("I am a JS Alert")) {
		System.out.println("js validation is pass");
	} else { 
		System.out.println("js validation is fail");
	}
	alt.accept();
	WebElement resultmsg  = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));
    String resultmsgfinal = resultmsg.getText();
	if(resultmsgfinal.contains("You successfully clicked an alert")){
		System.out.println("result msg is same as showing");
	} else {
		System.out.println("result msg is not same as showing");
	}
    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
    Alert alt1 = driver.switchTo().alert();
    String jsconfirm = alt1.getText();
    if(jsconfirm.equals("I am a JS Confirm")) {
    	System.out.println("jsconfirm validation is pass");
    } else {
    	System.out.println("jsconfirm validation is fail");
    }
    alt1.accept();
    WebElement reslutmsgforconfirm = driver.findElement(By.xpath("//p[text()='You clicked: Ok']"));
    String confirm = reslutmsgforconfirm.getText();
    if(confirm.equals("You clicked: Ok")) {
    	System.out.println("confirm result is same as showing");
    }else {
    	System.out.println("confirm result is same as showing");
    }
    
    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    Alert alt2 = driver.switchTo().alert();
    String prompt = alt2.getText();
    if(prompt.equals("I am a JS prompt")) {
    	System.out.println("prompt validation is pass");
    } else {
    	System.out.println("prompt validation is fail");
    }
    alt2.sendKeys("hi am chitti....cool");
    alt2.accept();
    WebElement promptalert = driver.findElement(By.id("result"));
   String promptmsg =  promptalert.getText();
   if(promptmsg.contains("hi am chitti....cool")) {
	   System.out.println("prompt msg is showing which is entered in textbox");
    	
    } else {
    	System.out.println("prompt msg is showing which is not entered in textbox");
    }
    
   driver.close();
}
}
