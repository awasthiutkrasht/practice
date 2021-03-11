package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		d.findElement(By.xpath("//a[@rel='async']")).click();
		WebElement daylist = d.findElement(By.id("day"));
		daylist.click();
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ENTER);
        d.close();
	}

}
