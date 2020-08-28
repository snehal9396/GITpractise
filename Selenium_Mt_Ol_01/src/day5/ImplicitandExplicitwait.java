package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitwait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//imlicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); //tagname#id
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		//explicit wait
		WebDriverWait wt = new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Welcome Admin"))).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		
		//Thread.sleep(1000);
		
		
		//driver.findElement(By.linkText("Welcome Admin")).click();
		//driver.findElement(By.linkText("Logout")).click();
		

	}

}