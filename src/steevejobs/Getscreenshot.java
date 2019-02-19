package steevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getscreenshot
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//Get size and change size
	int w= driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	System.out.println(w+" "+h);
	// change size of browser window
	Dimension d= new Dimension(400,300); //width and height
	driver.manage().window().setSize(d);
	Thread.sleep(5000);
	//Get position of browser window
	int x= driver.manage().window().getPosition().getX();
	int y=driver.manage().window().getPosition().getY();
    System.out.println(x+" "+y);
 // change position of browser window
	Point p=new Point(400,100); // x&y axis
	driver.manage().window().setPosition(p);
    Thread.sleep(5000);
    //close site
    driver.close();

	
	
	
	
	
	
	
	
	
	}

}
