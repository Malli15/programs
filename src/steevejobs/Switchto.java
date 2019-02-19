package steevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto
{
public static void main(String[] args) throws Exception 
{
		//Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_intro.asp");
	Thread.sleep(5000);
	//switch to frame
	//driver.switchTo().frame("")

	}

}
