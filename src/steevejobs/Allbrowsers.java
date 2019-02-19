package steevejobs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allbrowsers
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter browser name");
    String x=sc.nextLine();
    WebDriver driver=null;
    if(x.equals("chrome"))
    {
    System.setProperty("webdriver.chrome.driver","G:\\Sweety\\chromedriver.exe");
	 driver=new ChromeDriver();
    }
    else if(x.equals("firefox"))
    {
    System.setProperty("webdriver.gecko.driver","G:\\Selenium\\geckodriver.exe");
    driver=new FirefoxDriver();
    }
    else
    {
    System.out.println("unknown browser");
    System.exit(0);
    
    }
  }
}
