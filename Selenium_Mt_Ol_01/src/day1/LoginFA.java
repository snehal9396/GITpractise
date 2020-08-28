package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//WebElement username = driver.findElement(By.name("txtUsername"));
		//username.sendKeys("Admin");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	
	
	}
	

}
