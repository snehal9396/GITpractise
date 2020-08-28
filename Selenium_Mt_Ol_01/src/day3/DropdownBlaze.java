package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBlaze {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		Select s = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		//s.selectByValue("Boston");
		s.selectByIndex(2);
		//s.selectByVisibleText("São Paolo");
		Thread.sleep(2000);
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		//s.selectByValue("Boston");
		s1.selectByIndex(2);
		//s.selectByVisibleText("São Paolo");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
