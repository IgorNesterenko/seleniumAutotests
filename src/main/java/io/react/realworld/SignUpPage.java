package io.react.realworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by neste on 13.05.2020.
 */
public class SignUpPage extends HomePage{


    public SignUpPage (WebDriver driver){
        super(driver);
    }

    public HomePage signUp (String username, String email, String password) {

        inputEmail(email);
        inputPassword(password);
        return new HomePage(driver);
    }

    public String getPageTitle () {
        return driver.findElement(By.cssSelector(".auth-page h1")).getText();
    }

    public void inputUserName (String username) {
        WebElement userNameField = signUpForm().findElement(By.cssSelector("input[type='text']"));
    }

    public void inputEmail (String email) {
        WebElement emailField = signUpForm().findElement(By.cssSelector("input[type='email']"));
    }

    public HomePage clickLoginButton (){
        WebElement signIpButton = driver.findElement(By.cssSelector("a[href = '#login']"));
        signIpButton.click();
        return new HomePage(driver);
    }

    public void inputPassword (String email) {
        WebElement emailField = signUpForm().findElement(By.cssSelector("input[type='password']"));
    }

    protected WebElement signUpForm() {
        return driver.findElement(By.cssSelector(".auth-page form"));
    }
}
