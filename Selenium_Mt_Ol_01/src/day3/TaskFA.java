package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TaskFA {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.frontaccounting.eu/index.php");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@value='demouser']")).sendKeys("demouser");
		//driver.findElement(By.xpath("//input[@value='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='SubmitUser']")).click();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[3]")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id='customer_id']")));
		s.selectByValue("593");
		//s.selectByIndex(1);
		//s.selectByVisibleText("Ade");
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"payment\"]")));
		//s1.selectByValue("1");
		s1.selectByIndex(1);
		
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[contains(text(),'urchases')]"));
		Thread.sleep(2000);
		a.moveToElement(move).perform();
		
		
		driver.findElement(By.id("CancelOrder")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Text of alert :"+alt.getText());
		alt.accept();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
