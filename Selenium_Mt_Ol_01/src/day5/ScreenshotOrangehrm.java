package day5;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOrangehrm {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); // tagname#id
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		//1st way //File sf =ts.getScreenshotAs(OutputType.FILE);
		//File df = new File("./src1.png");
		//2nd way
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./src1.png"));
		
		// TODO Auto-generated method stub

	}

}
