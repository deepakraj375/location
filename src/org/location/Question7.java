package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		WebElement txtUsername=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		txtUsername.sendKeys("greens velmurugan");
		WebElement btnClick2=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
		Thread.sleep(3000);
		btnClick2.click();

		Thread.sleep(3000);
		WebElement btnClick1=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		btnClick1.click();
		
		
		

		}
}
