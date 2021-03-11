package SimpleProram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver d = new ChromeDriver();
       d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       d.manage().window().maximize();
       d.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
       d.findElement(By.id("twotabsearchtextbox")).sendKeys("health");
       Thread.sleep(10000);
       List<WebElement> List_of_suggestions = d.findElements(By.xpath("//input[@type='text']/../.."));
      Thread.sleep(5000);
       int count=0;
       for(WebElement wb : List_of_suggestions ) {
    	   String st = wb.getText();
    	   System.out.println(st);
    	   count++;
       }
       System.out.println("total no. of count is:"+count);
       d.close();
	}

}
