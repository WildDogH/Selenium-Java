package myTest.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    private final int timeOut = 10;//�ȴ�ʱ��

    public BasePage(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;
    }

    /* ��дsenkeys���� */
    void sendkeys(WebElement element, String s) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));// ������ʽ�ȴ�
        element.clear();// ����������
        element.sendKeys(s);// ��������
    }

    /* ��дclick���� */
    void click(WebElement element) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));// ������ʽ�ȴ�
        element.click();
    }
}