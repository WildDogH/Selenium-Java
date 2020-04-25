package com.selenium.page;

import org.openqa.selenium.WebElement;

import com.selenium.base.DriverBase;
import com.selenium.util.getByLocator;

public class configurePage extends BasePage{
	public configurePage(DriverBase driver) {
		super(driver);
	}
	
	/**
	 * ��ȡGeneral��ǩ
	 */
	public WebElement generalTagElement() {
		return element(getByLocator.getByLocator("generalTag"));
	}
	
	/**
	 * ��ȡԴ�������ǩ
	 */
	public WebElement codeTagElement() {
		return element(getByLocator.getByLocator("codeTag"));
	}
	
	/**
	 * ��ȡ������������ǩ
	 */
	public WebElement triggerTagElement() {
		return element(getByLocator.getByLocator("triggerTag"));
	}
	
	/**
	 * ��ȡ����������ǩ
	 */
	public WebElement environmentTagElement() {
		return element(getByLocator.getByLocator("environmentTag"));
	}
	
	/**
	 * ��ȡ������ǩ
	 */
	public WebElement buildTagElement() {
		return element(getByLocator.getByLocator("buildTag"));
	}
	
	/**
	 * ��ȡ�����������ǩ
	 */
	public WebElement buildAfterTagElement() {
		return element(getByLocator.getByLocator("buildAfterTag"));
	}
	
	/**
	 * ��ȡ���水ť
	 */
	public WebElement saveElement() {
		return element(getByLocator.getByLocator("save"));
	}
	
	/**
	 * ��ȡӦ�ð�ť
	 */
	public WebElement applyElement() {
		return element(getByLocator.getByLocator("apply"));
	}
}