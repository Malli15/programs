package steevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailcompose
{
public static void main(String[] args) throws Exception
{
	//Launch gmail site
	System.setProperty("webdriver.chrome.driver","G:\\sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("http://www.gmail.com");
	Thread.sleep(5000);
    //Do login
	driver.findElement(By.name("identifier")).sendKeys("jyoshnareddy21727@gmail.com");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("chinnu17");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	//click compose
	driver.findElement(By.xpath("//*[text()='Compose']")).click();
	Thread.sleep(5000);
	// fill compose
	driver.findElement(By.name("to")).sendKeys("jyoshnareddy1817@gmail.com");
	driver.findElement(By.name("subjectbox")).sendKeys("wishes");
	driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Hi sir,\n how are you");
	Thread.sleep(5000);
	//driver.findElement(By.xpath(""))
	
	
	
	

}
}
