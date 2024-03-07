package Testng_00;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alert {
	WebDriver driver; //Global variable
	Alert s;
	Alert t;
	Alert u;

	@Test(priority=0)
	public void simple() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		s=driver.switchTo().alert();
		String Return1=s.getText();
		System.out.println("alert1"+Return1);
		Thread.sleep(2000);
		s.accept();
		Thread.sleep(3000);
		
	}
		@Test(priority=1)
		public void confirmation() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
			s=driver.switchTo().alert();
			String Return1=s.getText();
			System.out.println("alert1"+Return1);
			Thread.sleep(2000);
			s.accept();
			Thread.sleep(3000);
			}
		@Test(priority=2)
		public void prompt() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
			s=driver.switchTo().alert();
			String Return1=s.getText();
			System.out.println("alert1"+Return1);
			Thread.sleep(2000);
			s.accept();
			Thread.sleep(3000);
	}

	@BeforeMethod
	public void intial() {
		System.setProperty("webdriver.gecko.driver", "D:\\software\\brower driver& selenium library"
				+ "\\Browser Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void end() {
		driver.close();
		driver.quit();

	}

}

