package steevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Youtubesikulix
{
public static void main(String[]args) throws Exception 
{
	//Launch site
	System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebDriverWait w=new WebDriverWait(driver,20);
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("search")));
	//search for a video(SWD)
	driver.findElement(By.id("search")).sendKeys("nuvvele nuvvele song");
	driver.findElement(By.xpath("(//button[@aria-label='Search'])[2]/child::*[1]")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Nuvvele Nuvvele Full')])[1]")));
	//start video
	driver.findElement(By.xpath("(//*[contains(text(),'Nuvvele Nuvvele Full')])[1]")).click();
	//skip add if exists(sikulix)
	Thread.sleep(5000);
	Screen s=new Screen();
	if(s.exists("skipadd.png")!=null)
	{
		s.click("skipadd.png");	
	}
	// pause video(sikulix)
	s.mouseMove(200,200); // move mouse to video body
	s.click("pause.png");
	Thread.sleep(3000);
	s.click("play.png");
	//Thread.sleep(3000);
	//s.mouseMove(200,200);
	s.mouseMove("volume.png");
	Match e=s.find("bubble.png");
	int x=e.getX();
	int y=e.getY();
	Location l1=new Location(x-50,y);
	s.dragDrop(e, l1);
	Location l2=new Location(x+50,y);
	s.dragDrop(e,l2);
	//Thread.sleep(3000);
	s.click("maximize.png");
	//s.mouseMove(200,200);
	Thread.sleep(3000);
	s.click("minimize.png");
	// close site(sikulix)
	s.keyDown(Key.ALT);
	s.keyDown(Key.F4);
	s.keyUp(Key.F4);
	s.keyUp(Key.ALT);
	
	
    }
	
}


