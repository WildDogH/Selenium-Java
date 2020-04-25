package com.selenium.handle;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.selenium.base.DriverBase;
import com.selenium.page.loginPage;

public class loginPageHandle {
	public DriverBase driver;
	//ʵ����������ȫ�ֱ���
	public loginPage lp;
	public loginPageHandle(DriverBase driver) {
		this.driver = driver;
		//��ʼ��loginPage
		lp = new loginPage(driver);
	}
	
	/**
	 * ���ע������
	 */
	public void clickLoginToRegister() {
		lp.click(lp.getLoginToRegisterElement());
	}
	
	/**
	 * �����û���
	 */
	public void sendKeysUser(String username) {
		lp.sendKeys(lp.getUserElement(), username);
	}
	
	/**
	 * ����û���
	 */
	public void clearUser() {
		lp.clear(lp.getUserElement());
	}
	
	/**
	 * ��������
	 */
	public void sendKeysPassword(String userpassword) {
		lp.sendKeys(lp.getPasswordElement(), userpassword);
	}
	
	/**
	 * �������
	 */
	public void clearPassword() {
		lp.clear(lp.getUserElement());
	}
	
	/**
	 * �����¼
	 */
	public void clickLoginButton() {
		lp.click(lp.getLoginButtonElement());
	}
	
	/**
	 * ������ֵ�¼
	 */
	public void clickKeepLogin() {
		lp.click(lp.getKeepLoginBoxElement());
	}
	
	/**
	 * �ж��Ƿ��ǵ�¼ҳ��
	 * @return 
	 */
	public boolean assertLoginPage() {
		return lp.assertElementIs(lp.getUserElement());
	}
	
	/**
	 * �ж��û��������������������ҳ����ʾ�Ƿ���ȷ
	 * @return
	 */
	public void assertDangerDisplay() {
		if(lp.getAlertdangerElement().getText().equals("�û������������")) {
			System.out.println("�û������������UI��ʾ��ȷ");
			List<WebElement> eleList = lp.getDangerClassElements();
			int dangersize = eleList.size();
			if(dangersize == 2) {
				System.out.println("�û���������ҳ������������ʾUI��ȷ");
			}else if(dangersize == 1) {
				System.out.println("�û�������������������ʾUI��ȷ");
			}else{
				System.out.println("���ҳ������������ʾUI�Ƿ���ȷ");
			}
		}else {
			System.out.println("����ҳ�������Ϣ��ʾ");
		}
	}
}