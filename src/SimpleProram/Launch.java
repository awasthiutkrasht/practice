package SimpleProram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		
	//	System.setProperty("Webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
		//driver.get("https://www.yahoo.com");
	//	driver.navigate().back();
		driver.get("https://www.facebook.com");
	 driver.findElement(By.id("email")).sendKeys("this is my first code");
	 driver.findElement(By.name("pass")).sendKeys("12345");
	 driver.findElement(By.linkText("Forgotten account?")).click();
	 
	}
}
