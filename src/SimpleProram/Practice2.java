package SimpleProram;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		  d.findElement(By.name("q")).sendKeys("selenium");
		  
	  java.util.List<WebElement> List_of_suggestion = d.findElements(By.xpath("//span[contains(text(),'selenium')]"));
         for(WebElement wb : List_of_suggestion) {
        	String text = wb.getText();
        	if(text.contains("python")) {
        		wb.click();
        		break;
        	}
         }
           System.out.println("pass");
           d.close();
}}