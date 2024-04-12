package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//driver.manage().window().maximize();
		WebElement btnClick=driver.findElement(By.xpath("//span[@title='Trainer']"));
		btnClick.click();
		WebElement element=driver.findElement(By.xpath("//b[contains(text(),'Velmurugan')]"));
		String text=element.getText();
		System.out.println(text);
}
}
