package SimpleProram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     WebDriver d =new ChromeDriver();
     d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     d.get("https://www.facebook.com");
     
     WebElement pass = d.findElement(By.name("email"));
     pass.sendKeys("utkrashtawasthi@gmail.com");
     Robot r =new Robot();
     
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_A);
     Thread.sleep(1000);
     
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_A);
     
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_C);
   
     
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_C);
     Thread.sleep(1000);
     
     r.keyPress(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_TAB);
     Thread.sleep(1000);
     
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_A);
     
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
     Thread.sleep(1000);
     System.out.println("Copy Paste Done");
     d.close();
	}

}
