package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		//driver.manage().window().maximize();
		WebElement btnClick=driver.findElement(By.xpath("//span[@title='Overview']"));
		btnClick.click();
		WebElement txtelement=driver.findElement(By.xpath("(//p[contains(text(),'.')])[1]"));
	String text=txtelement.getText();
	System.out.println(text);

}
}
