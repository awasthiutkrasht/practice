package SimpleProram;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter input to check inventory: ");
		String valuetobesearch = s.nextLine();
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
  driver.findElement(By.cssSelector("input[type='text']")).sendKeys(valuetobesearch);
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  Thread.sleep(10000);
  String acttext = driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
  System.out.println(acttext);
  driver.close();
	}

}
