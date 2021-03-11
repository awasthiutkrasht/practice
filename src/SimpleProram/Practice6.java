package SimpleProram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        d.manage().window().maximize();
        d.get("https://www.flipkart.com/");
        d.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        d.findElement(By.name("q")).sendKeys("grocery");
        Thread.sleep(10000);
		List<WebElement> List_of_webelement = d.findElements(By.xpath("//span[contains(text(),'grocery')]/.."));
        int count=0;
        for(WebElement wb :List_of_webelement ) {
        	String st = wb.getText();
        	System.out.println(st);
        	count++;
        }
           System.out.println("total no of count is :"+count);
           d.close();
	
	}

}

