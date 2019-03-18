package com.sonata.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingAuto {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/customerReg/CustomerDetails.html");
		 
		Thread.sleep(3000);
		 
		driver.findElement(By.name("t1")).sendKeys("Nikhil Dev");
		driver.findElement(By.name("t2")).sendKeys("nikhildev203@gmail.com");
		driver.findElement(By.name("t3")).sendKeys("9742107503");
		 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		}
}
