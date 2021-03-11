package SimpleProram;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args)
	{
	     ChromeOptions co = new ChromeOptions();
       co.addArguments("--disable-notifications");
       co.addArguments("start-maximized");
      WebDriver d=new ChromeDriver(co);
      
       d.get("https://www.cleartrip.com/");
      
    
     d.findElement(By.xpath("//a[@class='calendarIcon']/i")).click();
     d.findElement(By.xpath("//a[contains(text(),'16')][1]")).click();
      //adults
     WebElement adults = d.findElement(By.name("adults"));
     Select s1 = new Select(adults);
     s1.selectByIndex(3);
     //children
     WebElement childs = d.findElement(By.name("childs"));
     Select s2 = new Select(childs);
     s2.selectByValue("4");
     //infants
     WebElement infants = d.findElement(By.name("infants"));
     Select s3 = new Select(infants);
     s3.selectByIndex(3);
     //link text
     d.findElement(By.xpath("//a[text()=' Class of travel, Airline preference']")).click();
     d.findElement(By.name("airline")).sendKeys("Indigo");
     d.findElement(By.id("SearchBtn")).click();
     //error msg
     String text = d.findElement(By.id("homeErrorMessage")).getText();
     System.out.println(text);
     d.close();
     
	}

}
