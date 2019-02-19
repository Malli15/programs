package steevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(2000);
		// go to a drop-down
		WebElement e=driver.findElement(By.name("nights"));
		Select S=new Select(e);
		//collect all items in drop-down and display
		List<WebElement> l=S.getOptions();
		int n=l.size();
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
