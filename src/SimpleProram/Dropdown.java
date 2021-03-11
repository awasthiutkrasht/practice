package SimpleProram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver d = new ChromeDriver();
     d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     d.manage().window().maximize();
     d.get("https://rahulshettyacademy.com/AutomationPractice/");
     d.findElement(By.xpath("//input[@type='checkbox']")).click();
   System.out.println( d.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
   System.out.println(d.findElements(By.xpath("//input[@type='checkbox']")).size());
    d.close();
     }
	}

	
    
	


