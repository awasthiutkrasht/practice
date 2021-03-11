package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice5 {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		d.findElement(By.xpath("//a[@rel='async']")).click();
		// select day
		WebElement daylist = d.findElement(By.id("day"));
		Select s1 = new Select(daylist);
		s1.selectByIndex(28);
		//select month
		WebElement monthlist = d.findElement(By.id("month"));
		Select s2 = new Select(monthlist);        
		s2.selectByValue("8");
		//select year
		WebElement yearlist = d.findElement(By.id("year"));
		Select s3 = new Select(yearlist);
		s3.selectByVisibleText("2000");
		d.close();
	}

}
