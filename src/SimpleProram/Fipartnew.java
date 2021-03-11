package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fipartnew {
	public static void main(String[] args) {
       WebDriver driver  = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com");
       driver.findElement(By.xpath("//button[text()='✕']")).click();
       driver.findElement(By.name("q")).sendKeys("Apple iPhone 11 Pro (Gold, 64 GB)");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       String text = driver.findElement(By.xpath("//div[text()='Apple iPhone 11 Pro (Gold, 64 GB)']/following-sibling::div/span/div")).getText();
	System.out.println(text);
	driver.close();
	}	
 }
