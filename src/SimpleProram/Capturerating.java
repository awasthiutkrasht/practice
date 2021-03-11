package SimpleProram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturerating {
	public static void main(String[]args) throws Throwable {
		WebDriver d =new ChromeDriver();
	
		d.get("https://www.amazon.com");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 8");
	    d.findElement(By.cssSelector("input[type='submit']")).click();
	    Thread.sleep(5000);
	    String model= d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/span")).getText();
	    System.out.println("model of the phone"+model);
	    String rating=d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/span[1]/span/a/i[1]")).getAttribute("area-lable");
	    System.out.println("Rating is"+rating);
	    if(rating.contains("out of 5 star")) {
	    	System.out.println("rating print successful");
	    }else {
	    		System.out.println("rating not print");
	    }
	
	}

}