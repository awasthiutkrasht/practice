package SimpleProram;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatramousehandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       WebDriver d = new ChromeDriver();
       d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       d.get("https://www.yatra.com/");
       d.manage().window().maximize();
       WebElement SP = d.findElement(By.xpath("//a[contains(text(),'Support')]"));
       Actions act = new Actions(d);
       act.moveToElement(SP).perform();
       d.findElement(By.linkText("Make a Payment")).click();
       
	}

}
