package steevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxradio
{
public static void main(String[] args) throws Exception 
{
	//Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/checkboxradio");
	Thread.sleep(5000);
	//switch to frame
	driver.switchTo().frame(0);
	//operate elements
	//driver.findElement(By.xpath(""

	}

}
