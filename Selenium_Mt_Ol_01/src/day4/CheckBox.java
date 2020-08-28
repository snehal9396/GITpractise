package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin"); // tagname#id
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();

		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_Entitlements")).click();
		driver.findElement(By.id("menu_leave_addLeaveEntitlement")).click();
		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		boolean str = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(str);
		if (str == true)
			System.out.println("Checked"); // TODO Auto-generated method stub
		else {
			System.out.println("Unchecked...!!");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		}

		boolean str1 = driver.findElement(By.id("entitlements_filters_location")).isDisplayed();
		System.out.println(str1);
		
		if (str1 == true) {
			Select sel = new Select(driver.findElement(By.id("entitlements_filters_location")));
			sel.selectByIndex(1);
			Select sel2 = new Select(driver.findElement(By.id("entitlements_filters_subunit")));
			sel2.selectByIndex(1);
			
		} else {
			System.out.println("Dropdown not visible");

		}
	}

}
