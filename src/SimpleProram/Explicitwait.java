package SimpleProram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
	    
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
	

		d.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		d.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		WebDriverWait w = new WebDriverWait(d,20);
 w.until(ExpectedConditions.elementToBeClickable(By.id("results")));
	  System.out.println(d.findElement(By.id("results")).getText());	  

       d.close();
	}

}
