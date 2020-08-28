package day1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("http://demo.frontaccounting.eu/index.php");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close(); //to close current opened instance of brower.
		//driver.get("https://blazedemo.com/");
		//Thread.sleep(2000);
		//driver.quit();	
		
		// TODO Auto-generated method stub

	}

}
