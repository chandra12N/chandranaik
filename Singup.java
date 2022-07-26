package assinment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Singup {
	    @Test()
	    public void sign() throws InterruptedException

	{

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	driver.findElement(By.xpath("//a[@href='signup.html']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("chandra");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("naik");
	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("chandra12@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Chandra@123");
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("25-03-1988");
	driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
	driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9848022118");
	driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("hello");
	driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@type='Submit']")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("chandra");
	driver.findElement(By.id("password")).sendKeys("Chandra@123");
	driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	driver.quit();
	}    
	}
	
	
	
	
	
	


