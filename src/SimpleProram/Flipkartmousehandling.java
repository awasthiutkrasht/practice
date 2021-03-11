package SimpleProram;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartmousehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver d  = new ChromeDriver();
	       d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       d.manage().window().maximize();
	       d.get("https://www.flipkart.com");
	       d.findElement(By.xpath("//button[text()='✕']")).click();
	        WebElement HF = d.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
	       Actions act = new Actions(d);
	       act.moveToElement(HF).perform();
	       d.findElement(By.linkText("Sofa")).click();
	       d.close();

	}

}
