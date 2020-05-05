package io.react.realworld;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by neste on 03.05.2020.
 */
public class SignUpTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void startDriver(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void signUpTest(){
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
      WebElement element =  driver.findElement(By.cssSelector("#main > div > nav > div > ul > li:nth-child(3) > a"));
      element.click();
      String url  = driver.getCurrentUrl();
      assertThat((url).contains("ddddddf"));
              System.out.println(url);

    }
}
