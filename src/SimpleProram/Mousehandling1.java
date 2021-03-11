package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver d = new ChromeDriver();
     d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     d.get(" https://www.fatcow.com/");
     WebElement marketplace = d.findElement(By.linkText("MarketPlace"));
	//handling mouse over
     Actions act = new Actions (d);
     act.moveToElement(marketplace).perform();
     d.findElement(By.linkText("Web Hosting")).click();
     String acttext = d.findElement(By.xpath("//h1[text()='Web Hosting']")).getText();
     System.out.println(acttext);
     d.close();
	}

}
