package com.selenium.page;

import org.openqa.selenium.WebElement;

import com.selenium.base.DriverBase;
import com.selenium.util.getByLocator;

public class newJobPage extends BasePage{
	public newJobPage(DriverBase driver) {
		super(driver);
	}
	
	/**
	 * ��ȡ�������������
	 */
	public WebElement jobNameElement() {
		return element(getByLocator.getByLocator("jobName"));
	}
	
	/**
	 * ��ȡFreestyleprojectѡ��
	 */
	public WebElement freestyleProjectElement() {
		return element(getByLocator.getByLocator("freestyleProject"));
	}
	
	/**
	 * ��ȡ��ˮ��ѡ��
	 */
	public WebElement workFlowElement() {
		return element(getByLocator.getByLocator("workFlow"));
	}
	
	/**
	 * ��ȡ����һ����������Ŀѡ��
	 */
	public WebElement matrixProjectElement() {
		return element(getByLocator.getByLocator("matrixProject"));
	}
	
	/**
	 * ��ȡGitHub��֯ѡ��
	 */
	public WebElement GitHubSCMNavigatorElement() {
		return element(getByLocator.getByLocator("GitHubSCMNavigator"));
	}
	
	/**
	 * ��ȡ���֧��ˮ��ѡ��
	 */
	public WebElement WorkflowMultiBranchProjectElement() {
		return element(getByLocator.getByLocator("WorkflowMultiBranchProject"));
	}
	
	/**
	 * ��ȡ�ļ���ѡ��
	 */
	public WebElement FolderElement() {
		return element(getByLocator.getByLocator("Folder"));
	}
	
	/**
	 * ��ȡ�����Զ���������
	 */
	public WebElement autoFinishElement() {
		return element(getByLocator.getByLocator("autoFinish"));
	}
	
	/**
	 * ��ȡȷ����ť
	 */
	public WebElement OkElement() {
		return element(getByLocator.getByLocator("Ok"));
	}
}