package io.react.realworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by neste on 13.05.2020.
 */
public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public HomePage login (String email, String password) {
        inputEmail(email);
        inputPassword(password);
        return new HomePage(driver);
    }

    public String getPageTitle () {
        return driver.findElement(By.cssSelector(".auth-page h1")).getText();
    }

    public void inputEmail (String email) {
        WebElement emailField = signInForm().findElement(By.cssSelector("input[type='email']"));
    }

    public HomePage clickLoginButton (){
        WebElement signIpButton = driver.findElement(By.cssSelector("a[href = '#login']"));
        signIpButton.click();
        return new HomePage(driver);
    }

    public void inputPassword (String email) {
        WebElement emailField = signInForm().findElement(By.cssSelector("input[type='password']"));
    }

    protected WebElement signInForm() {
        return driver.findElement(By.cssSelector(".auth-page form"));
    }
}
