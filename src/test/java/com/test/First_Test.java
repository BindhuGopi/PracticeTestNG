package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Test 
{
	@Test
	public void Google() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Monkey images", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}
	@Test
	public void Facebook() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Bindhu");
		driver.findElement(By.name("pass")).sendKeys("12345",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}
}
