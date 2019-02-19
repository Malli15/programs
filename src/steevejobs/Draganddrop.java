package steevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
public static void main(String[] args)throws Exception
{
	//Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Enter text into cache element
	driver.findElement(By.name("q")).sendKeys("virat");
	Thread.sleep(5000);
	Actions a=new Actions(driver);
	int flag=0;
	for(int i=1;i<=10;i++)
	{
		a.sendKeys(Keys.DOWN).build().perform();
		String x=driver.findElement(By.name("q")).getAttribute("value");
				if(x.equals("virat kohli wiki"))
				{
					flag=1;
				}
		Thread.sleep(5000);
	}
	if(flag==1)
	{
		System.out.println("Item found on cache");
	}
	else
	{
		System.out.println("Item not found on cache");
	}
	//close site
	driver.close();
}
}

