package com.vtiger.testScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.genriclib.DataUtility;

public class CreateContactList {
  public static void main(String[] args) throws IOException {
	DataUtility data = new DataUtility();
	WebDriver driver = null;
	if(data.getDataFromProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\nan\\selenium auto\\chromedriver.exe\\");
		driver = new ChromeDriver();
	} if(data.getDataFromProperty("browser").equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "E:\\nan\\selenium auto\\geckodriver.exe\\");
		driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(data.getDataFromProperty("url"));
	driver.manage().window().maximize();
	
	driver.findElement(By.name("user_name")).sendKeys(data.getDataFromProperty("username"));
	driver.findElement(By.name("user_password")).sendKeys(data.getDataFromProperty("password"));
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
	driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
	
	driver.findElement(By.name("lastname")).sendKeys(data.getDataFromExcel("Sheet3", 1, 3));
	
	driver.findElement(By.name("button")).click();
	
	String headertext = driver.findElement(By.className("dvHeaderText")).getText();
	System.out.println(headertext);
	if(headertext.contains(data.getDataFromExcel("Sheet3", 2, 3))) {
		System.out.println("contact create successfully");
	} else {
		System.out.println("contact creation is fail");
	}
	driver.close();
}
}
