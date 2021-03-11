package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart1 {

	public static void main(String[] args) {
	  
		WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        d.manage().window().maximize();
        d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		d.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		d.findElement(By.xpath("//h4[text()='Cauliflower - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		d.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		d.findElement(By.xpath("//h4[text()='Beetroot - 1 Kg']/..//button[text()='ADD TO CART']")).click();
		d.findElement(By.xpath("//a[@class='cart-icon']")).click();
		d.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		d.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(d.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		d.close();
		
		
		
	}

}
