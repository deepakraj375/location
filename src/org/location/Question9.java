package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSearch=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txtSearch.sendKeys("sunglasses");
		WebElement btnClick=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnClick.click();
		WebElement btnClick1=driver.findElement(By.xpath("(//p[@class='product-title '])[1]"));
		btnClick1.click();


	}

}
