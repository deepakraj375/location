package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		WebElement  btnClick=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		btnClick.click();
		
		WebElement txtSearch=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtSearch.sendKeys("9789441712");
		String element=txtSearch.getAttribute("value");
		System.out.println(element);
		WebElement  btnClick1=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnClick1.click();

}
}