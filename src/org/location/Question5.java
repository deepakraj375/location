package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txtGreen=driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		String text1=txtGreen.getText();
		System.out.println(text1);
	}

}
