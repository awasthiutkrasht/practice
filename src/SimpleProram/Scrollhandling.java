package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scrollhandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       WebDriver d = new ChromeDriver();
       d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       d.manage().window().maximize();
       d.get("https://www.flipkart.com");
       d.findElement(By.xpath("//button[text()='✕']")).click();
       d.findElement(By.name("q")).sendKeys("iphone");
       d.findElement(By.cssSelector("button[type='Submit']")).click();
       Thread.sleep(5000);
	EventFiringWebDriver event = new EventFiringWebDriver(d);
	event.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
    d.close();
		
	}

}
