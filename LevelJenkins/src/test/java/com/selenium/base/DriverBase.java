package com.selenium.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverBase {
	public WebDriver driver;
	
	//������̳л���
	public DriverBase(String browser) {
		SelectDriver selectDriver = new SelectDriver();
		//thisȫ�ֱ�����driver
		this.driver = selectDriver.driverName(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void quit() {
		//System.out.println("quit webdriver");
		driver.quit();
	}
	
	/**
	 * ��װElement����
	 */
	public WebElement findElement(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}
	
	/**
	 * ��װElements����
	 */
	public List<WebElement> findElements(By by) {
		List<WebElement> elements = driver.findElements(by);
        return elements;
	}

	public void get(String url) {
		System.out.println("��ת����Ϊ" + url);
		driver.get(url);
	}

}