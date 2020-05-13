package io.react.realworld;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by neste on 07.05.2020.
 */
public class BaseTest {
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void startDriver(){
        driver = new ChromeDriver();
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    protected void checkPage (String pageHeader) {
        WebElement singUpHeader = driver.findElement(By.cssSelector(".auth-page h1"));
        assertThat(singUpHeader.getText()).isEqualTo(pageHeader);
    }
    protected WebElement signForm() {
        return driver.findElement(By.cssSelector(".auth-page form"));
    }

    protected WebElement emailField() {
        return signForm().findElement(By.cssSelector("input[type='email']"));
    }

    protected WebElement passwordField() {
        return signForm().findElement(By.cssSelector("input[type='password']"));
    }

    protected void clickSingInButton() {
        WebElement signInButton = signForm().findElement(By.cssSelector("button[type='submit']"));
        signInButton.click();
    }

    protected void inputText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    protected void userShouldBeLoggedIn(String userName) {
        WebElement userInfo = driver.findElement(By.cssSelector("[href='#@" +userName+"']"));
        assertThat(userInfo.isDisplayed()).isTrue();
    }

    protected void clickLoginButton (){

        WebElement signIpButton = driver.findElement(By.cssSelector("a[href = '#login']"));
        signIpButton.click();
    }

    protected void clickSignUpButton (){

        WebElement signIpButton = driver.findElement(By.cssSelector("a[href = '#register']"));
        signIpButton.click();
    }

    protected void clickUserButton (String userName){
        WebElement userButton = driver.findElement(By.cssSelector("[href='#@" +userName+"']"));
        userButton.click();
    }
}
