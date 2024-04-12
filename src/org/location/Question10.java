package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		WebElement txtSearch=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		txtSearch.sendKeys("mobiles");
		WebElement btnClick=driver.findElement(By.xpath("//button[@type='submit']"));
		btnClick.click();
		WebElement btnClick1=driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		btnClick1.click();

}
}