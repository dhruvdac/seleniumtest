package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InputValidationTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void inputTest() throws InterruptedException {
		WebElement field1 = driver.findElement(By.id("firstname"));
		field1.sendKeys("cdacacts");
		WebElement field2 = driver.findElement(By.id("surname"));
		field2.sendKeys("cdacPunecdacPune");
		WebElement field3 = driver.findElement(By.id("age"));
		field3.sendKeys("26");
		WebElement field4 = driver.findElement(By.id("country"));
		field4.sendKeys("india");
		WebElement field5 = driver.findElement(By.id("notes"));
		field5.sendKeys("This is cdac acts");
		
		WebElement button = driver.findElement(By.xpath("/html/body/div/div[3]/form/input[4]"));
		button.click();
		Thread.sleep(10000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
