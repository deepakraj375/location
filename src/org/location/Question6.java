package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main (String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com/");
	driver.manage().window().minimize();
	WebElement txtUsername=driver.findElement(By.xpath("//input [@type='text']"));
	txtUsername.sendKeys("deepankumar");
	
	WebElement txtPassword=driver.findElement(By.xpath("(//input [@type='password'])"));
	txtPassword.sendKeys("2345678");
	String attribute=txtUsername.getAttribute("value");
	String attribute1=txtPassword.getAttribute("value");
System.out.println(attribute);
System.out.println(attribute1);

	}

}
