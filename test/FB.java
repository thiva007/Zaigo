package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maven.in.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB extends BaseClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement element = driver.findElement(By.xpath("//div[@id='desktop-1']/parent::div"));
		String text = element.getText();
		System.out.println(text);

	}

}
