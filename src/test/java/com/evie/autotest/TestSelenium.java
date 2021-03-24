package com.evie.autotest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestSelenium {

    @Test
    void test_127381() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700)");
    }

    @FindBy(id = "")
    public WebElement element1;

    @FindBy(xpath = "")
    public WebElement element2;

    @FindBy(linkText = "")
    public WebElement element3;

    @FindBy(className = "")
    public WebElement element4;

    @FindBy(css = "")
    public WebElement element5;
}
