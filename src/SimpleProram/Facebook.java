package SimpleProram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("1233");
		driver.findElement(By.id("pass")).sendKeys("qrst");
		driver.findElement(By.id("loginbutton")).click();
		String errormsg = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
		
	if (errormsg.contains("The email address or phone number ")) 
		{
		System.out.println("login unsuccessful");
		}
		else
		{
			System.out.println("login successful");
		}
        driver.close();
	}

}
