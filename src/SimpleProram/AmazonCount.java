package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone xr");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
	
		//Mouse action handling
		WebElement rating = driver.findElement(By.xpath("(//span[text()='4.5 out of 5 stars'])[1]/.."));
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		act.moveToElement(rating).perform();
		//Thread.sleep(10000);
		
		
		String rating1 = driver.findElement(By.xpath("(//span[text()='4.5 out of 5'])[2]")).getText();
		System.out.println("Rating of Iphone 8 + 64gb is " + rating1);
		driver.close();
	}
}

