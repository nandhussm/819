package section2.practice.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
   public static void main(String[] args) throws InterruptedException {
    String s1 = "hi";
    String s2 = "hello";
    String s3 = "everyone";
    String s4 = "all";
    s1 = s1 + s2 +s3+s4;
    s2 = s1.substring(0, s1.length()-s2.length()-s3.length()-s4.length());
    s1 = s1.substring(beginIndex, endIndex)
    System.out.println("s2 :" + s2);
    System.out.println(s1);
   }
}
