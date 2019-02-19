package steevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement 
{
public static void main(String[] args) throws Exception
{
   //Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.way2sms.com");
	Thread.sleep(5000);
	//Get attribute value
	WebElement e1=driver.findElement(By.name("mobileNo"));
	String x=e1.getAttribute("id");
	System.out.println(x);
	//Get text value and css property value
	//WebElement e2=driver.findElement(By.xpath("")
	
	
	

	}

}
