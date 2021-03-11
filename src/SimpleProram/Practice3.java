package SimpleProram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		  d.findElement(By.name("q")).sendKeys("selenium");
		  Thread.sleep(2000);
	  java.util.List<WebElement> List_of_suggestion = d.findElements(By.xpath("//span[contains(text(),'selenium')]"));
         int count=0;
	  for(WebElement wb : List_of_suggestion) {
		  String st = wb.getText();
		  System.out.println(st);
		  count++;
	  }
	  System.out.println("total no of count is:"+count);
	  d.close();
	}

}
