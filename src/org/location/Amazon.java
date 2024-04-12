package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		WebElement txtelement=driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
	String text=txtelement.getText();
	System.out.println(text);

}
}