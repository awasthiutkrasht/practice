package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.salesforce.com/in/");
	driver.findElement(By.xpath("//h2[@id='login']/../../../a")).click();
	driver.findElement(By.id("username")).sendKeys("awasti");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("Login")).click();
	
	String errorMsg=driver.findElement(By.id("error")).getText();
	
	if(errorMsg.contains("Please check your username and password"))
	{
		System.out.println("login unsuccessful");
	}
	else
	{
		System.out.println("login successful");
	}
	driver.close();
}
}
