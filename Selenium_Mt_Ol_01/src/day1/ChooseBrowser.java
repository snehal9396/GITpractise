package day1;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseBrowser {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Enter chrome\nEnter firefox");
		System.out.println("Enter choice:");
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
	
		switch (ch)
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get("https://www.google.com/");
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
			//driver.close();
			break;
		
			
		
		case "firefox":
	
			System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("https://www.google.com/");
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
			//driver.close();
			break;
		
		default:
			System.out.println("Invalid Choice");	
			break;
			
		
		
		}
		/*try {
			driver.get("https://www.google.com/");
		}catch(Exception e)
		{
			System.out.println("Exception:"+ e.getMessage());
		}
		*/
		if(driver!=null)
		{
			System.out.println("Exception");
		}
		
	}
}
	

	

