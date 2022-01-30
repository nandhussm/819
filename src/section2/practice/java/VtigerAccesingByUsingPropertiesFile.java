package section2.practice.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerAccesingByUsingPropertiesFile {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("E:\\commondata\\Commondatttaaa.Properties\\");
	Properties pobj = new Properties();
	pobj.load(fis);
	
	String urll = pobj.getProperty("url");
	String username = pobj.getProperty("username");
	String password = pobj.getProperty("password");
	String browser = pobj.getProperty("browser");
	
	System.out.println("urll" + urll);
	System.out.println("username" + username);
	System.out.println("password" + password);
	System.out.println("browser" + browser);
	
	
	WebDriver driver = null;
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		driver=new ChromeDriver();
	} else if (browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "E:\\nan\\selenium auto\\geckodriver.exe\\");
		driver=new FirefoxDriver();
	} else if(browser.equals("opera")) {
		System.setProperty("webdriver.opera.driver", "E:\\nan\\selenium auto\\operadriver.exe\\");
		driver=new OperaDriver();
	} else if(browser.equals("edge")) {
		System.setProperty("webdriver.edge.driver", "E:\\nan\\selenium auto\\msedgedriver.exe\\");
		driver=new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(urll);
	driver.manage().window().maximize();
	
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password , Keys.ENTER);
	WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
	Actions act = new Actions(driver);
	act.moveToElement(more).perform();
	driver.findElement(By.name("Invoice")).click();
	driver.findElement(By.cssSelector("[alt='Create Invoice...']")).click();
	
	driver.findElement(By.name("subject")).sendKeys("Nandhu IT King");
	
	driver.findElement(By.xpath("(//img[@alt='Select'])[3]")).click();
	
	String mainid = driver.getWindowHandle();
	Set<String> allid = driver.getWindowHandles();
	for(String id : allid) {
		if(!mainid.equals(id)) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Organizations"));
			driver.switchTo().window(id);
			
		}
		
	}
	driver.findElement(By.xpath("//a[text()='nandhu']")).click();
	
  Alert alt =  driver.switchTo().alert();
  String alertingmsg =  alt.getText();
  if(alertingmsg.equals("Do you want to Overwrite the existing address with this selected organization(nandhu) address details?")) {
	  System.out.println("Organization alert msg validate succesfull");
  } else {
	  System.out.println("Organization alert msg is not validate successfull");
  }
  alt.accept();
  
  driver.switchTo().window(mainid);
  driver.findElement(By.id("searchIcon1")).click();
  String mainid1 = driver.getWindowHandle();
  Set<String> allid1 = driver.getWindowHandles();
  for(String ids : allid1) {
	  if(!mainid1.equals(ids)) {
		  driver.switchTo().window(ids);
		  if(driver.getTitle().equals("Products"));
		  driver.switchTo().window(ids);
		  
	  }
  }
  driver.findElement(By.xpath("//a[text()='knucklle']")).click();
  
  driver.switchTo().window(mainid1);
  driver.findElement(By.name("bill_street")).sendKeys("abc");
 
  WebElement copyBAdd = driver.findElement(By.xpath("(//td[@class='detailedViewHeader'])[4]/input"));
  Actions act1 = new Actions(driver);
  act1.moveToElement(copyBAdd).click().build().perform();
  
  
  driver.findElement(By.id("qty1")).sendKeys("4");
  
  WebElement Finalreport = driver.findElement(By.name("button"));
  Finalreport.click();
 WebElement invoice  = driver.findElement(By.xpath("//span[text()='Nandhu IT King -  Invoice Information']"));
 String finalinvoicereport = invoice.getText();
 System.out.println(finalinvoicereport + " saved succesfully");

  driver.close();	
}
}
