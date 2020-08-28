package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); //tagname#id
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("menu_admin_viewAdminModule"));
		a.moveToElement(move).build().perform();
		List <WebElement> menus =driver.findElements(By.className("firstLevelMenu"));
		
		System.out.println("Size of list :" + menus.size());
		//System.out.println("1st ele of menu list :" + menus.get(0).getText());
		//System.out.println("last ele of menu list :" +menus.get(menus.size()-1).getText());
	
		for (int i=0; i<menus.size(); i++)
		{
			System.out.println(menus.get(i).getText());
			a.moveToElement(menus.get(i)).perform();
		}
		
	
		// TODO Auto-generated method stub

	}

}
