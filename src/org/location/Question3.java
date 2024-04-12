package org.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//driver.manage().window().maximize();
		WebElement txtGreen=driver.findElement(By.xpath("(//h6[contains(text(),'Greens')])[1]"));
		String text1=txtGreen.getText();
		//System.out.println();
		//WebElement element=driver.findElement(By.xpath("(//span[contains(text(),'Adyar')])[1]"));
		//String text2=element.getText();
		System.out.println(text1);
		WebElement elementplot=driver.findElement(By.xpath("//span[contains(text(),'No')]"));
		String text3=elementplot.getText();
		System.out.println(text3);
		WebElement elementstreet=driver.findElement(By.xpath("//span[contains(text(),'First')]"));
		String text4=elementstreet.getText();
		System.out.println(text4);
		WebElement elementnagar=driver.findElement(By.xpath("//span[contains(text(),'pad')]"));
		String text5=elementnagar.getText();
		System.out.println(text5);
		WebElement element2=driver.findElement(By.xpath("(//span[contains(text(),'Adyar')])[2]"));
		String text6=element2.getText();
		System.out.println(text6);
		//WebElement elementpincode=driver.findElement(By.xpath("(//span[contains(text(),'Chennai')])[1]"));
		//String textcode=elementpincode.getText();
		//System.out.println(textcode);
		WebElement element4=driver.findElement(By.xpath("(//a[contains(text(),'91 8939')])[5]"));
		String text8=element4.getText();
		System.out.println(text8);
		WebElement element5=driver.findElement(By.xpath("(//a[contains(text(),'greens')])[5]"));
		String text9=element5.getText();
		System.out.println(text9);
}
}
	


