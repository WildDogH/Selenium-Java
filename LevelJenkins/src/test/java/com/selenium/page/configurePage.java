package com.selenium.page;

import org.openqa.selenium.WebElement;

import com.selenium.base.DriverBase;
import com.selenium.util.getByLocator;

public class configurePage extends BasePage{
	public configurePage(DriverBase driver) {
		super(driver);
	}
	
	/**
	 * 获取General标签
	 */
	public WebElement generalTagElement() {
		return element(getByLocator.getByLocator("generalTag"));
	}
	
	/**
	 * 获取源码管理标签
	 */
	public WebElement codeTagElement() {
		return element(getByLocator.getByLocator("codeTag"));
	}
	
	/**
	 * 获取构建触发器标签
	 */
	public WebElement triggerTagElement() {
		return element(getByLocator.getByLocator("triggerTag"));
	}
	
	/**
	 * 获取构建环境标签
	 */
	public WebElement environmentTagElement() {
		return element(getByLocator.getByLocator("environmentTag"));
	}
	
	/**
	 * 获取构建标签
	 */
	public WebElement buildTagElement() {
		return element(getByLocator.getByLocator("buildTag"));
	}
	
	/**
	 * 获取构建后操作标签
	 */
	public WebElement buildAfterTagElement() {
		return element(getByLocator.getByLocator("buildAfterTag"));
	}
	
	/**
	 * 获取保存按钮
	 */
	public WebElement saveElement() {
		return element(getByLocator.getByLocator("save"));
	}
	
	/**
	 * 获取应用按钮
	 */
	public WebElement applyElement() {
		return element(getByLocator.getByLocator("apply"));
	}
}
