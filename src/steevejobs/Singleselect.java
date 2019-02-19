package steevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselect 
{
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in");
	Thread.sleep(2000);
	// check drop-down
	WebElement e=driver.findElement(By.name("nights"));
	Select S=new Select(e);
	if(S.isMultiple())
	{
		System.out.println("Multiselect");
	}
	else
	{
		System.out.println("Singleselect");
	}
	//close site
	driver.close();
	}
}
