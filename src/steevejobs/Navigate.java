package steevejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	Thread.sleep(5000);
	//Go to gmail
	driver.navigate().to("http://www.gmail.com");
	Thread.sleep(5000);
	driver.navigate().to("http://www.gmail.com");
	Thread.sleep(5000);
	//back to google
	driver.navigate().back();
	Thread.sleep(5000);
	//forward to gmail
	driver.navigate().forward();
	Thread.sleep(5000);
	//refresh gmail
	driver.navigate().refresh();
	//close site
	driver.close();
	

	}

}
