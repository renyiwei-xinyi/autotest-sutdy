package com.evie.autotest.selnium;

import com.evie.autotest.component.CeshirenPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class CeshirenLoginTest {

    private static ChromeDriver driver;
    private final int timeOut = 300;


    @BeforeAll
    static void before_all() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(new ChromeOptions().setHeadless(false));
    }

    @Test
    void test_login() throws InterruptedException {
        driver.get("https://ceshiren.com/");
        CeshirenPage ceshirenPage = PageFactory.initElements(driver, CeshirenPage.class);
        ceshirenPage.click(ceshirenPage.search_button);
        ceshirenPage.sendKeys(ceshirenPage.search_term, "微信小程序自动化");
        ceshirenPage.click(ceshirenPage.search_text);
    }

    @AfterAll
    static void after_all() {
        driver.close();
    }
}
