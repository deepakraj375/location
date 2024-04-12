package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().minimize();
		//Thread.sleep(3000);
		WebElement txtUsername=driver.findElement(By.xpath("//input[@name='username']"));
		txtUsername.sendKeys("deepankumar");
		String element1=txtUsername.getAttribute("value");
		
		System.out.println(element1);
		//Thread.sleep(3000);

		WebElement txtPassword=driver.findElement(By.xpath("(//input [@name='password'])"));
		txtPassword.sendKeys("2345678");
		String element2=txtPassword.getAttribute("value");
		System.out.println(element2);

}}
