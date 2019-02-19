package steevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Singleselect2 
{
public static void main(String[] args)throws Exception
{
	//Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://semantic-ui.com/modules/dropdown.html");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//click on drop-down to get items for display
    driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]")).click();
    Thread.sleep(5000);
    //select item one after other
    List<WebElement> l=driver.findElements(By.xpath("//*[contains(@class,' active visible')]/div[2]/div"));
    for(int i=0;i<l.size();i++)
    {
    	l.get(i).click();
    	Thread.sleep(5000);
    	//open drop-down for next item selection
    	driver.findElement(By.xpath("(//*[contains(@class,'ui selection dropdown')])[1]")).click();
    	 Thread.sleep(5000);
    }
    // to close drop-down
    Actions a=new Actions(driver);
    a.sendKeys(Keys.ESCAPE).build().perform();
    Thread.sleep(5000);
    //close site
    driver.close();
    
    
    
    
    
    
}
}
