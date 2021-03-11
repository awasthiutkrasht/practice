package SimpleProram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testselenium {
//error in this one
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        d.manage().window().maximize();
        
        d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        d.findElement(By.id("checkBoxOption1")).click();
       WebElement opt = d.findElement(By.id("checkBoxOption1"));
   
      String output = opt.getText();
        d.findElement(By.id("dropdown-class-example")).click();
        WebElement option = d.findElement(By.id("dropdown-class-example"));
        Select s1 = new Select(option);
        s1.selectByIndex(1);
        d.findElement(By.name("enter-name")).sendKeys(output);
        d.close();
        d.findElement(By.name("enter-name")).sendKeys(output);
        d.findElement(By.id("alertbtn")).click();
	}

}



////public static void main(String[] args) {
//
//
//
//	// TODO Auto-generated method stub
//
//
//
//	//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
//
//	   
//
//	        WebDriver driver = new ChromeDriver();
//
//	   
//
//	        driver.get("http://qaclickacademy.com/practice.php");
//
//	        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
//
//	        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
//
//	        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
//
//	        Select s=new Select(dropdown);
//
//	        s.selectByVisibleText(opt);
//
//	        driver.findElement(By.name("enter-name")).sendKeys(opt);
//
//	        driver.findElement(By.id("alertbtn")).click();
//
//	     String text=  driver.switchTo().alert().getText();
//
//	     if(text.contains(opt))
//
//	     {
//
//	    System.out.println("Alert message success");
//
//	     }
//
//	     else
//
//	    System.out.println("Something wrong with execution");
//
//	}
//
//	       
//
//	       
//
//	     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   
//
//	       
//
//	       
//
//
//
//	}