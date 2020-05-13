package io.react.realworld;
import User.User;
import User.UserFaker;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by neste on 13.05.2020.
 */
public class LoginTest extends BaseTest{

    private User user = UserFaker.randomUser();

    @Test
    public void loginTest () {
        clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        assertThat(loginPage.getPageTitle()).isEqualTo("Sign In");
        loginPage.inputEmail(user.getEmail());
        loginPage.inputPassword(user.getPassword());
        HomePage homePage = loginPage.login(user.getEmail(), user.getPassword());
        assertThat(homePage.isUserLoggedIn(user.getUserName()));
    }

}
