package io.react.realworld;

import User.User;
import User.UserFaker;
import org.testng.annotations.Test;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by neste on 03.05.2020.
 */
public class SignUpTest extends BaseTest {
    private User user = UserFaker.defaultUser();

    @Test
    public void signUpTest(){
        clickSignUpButton();
        SignUpPage signUpPage = new SignUpPage(driver);
        assertThat(signUpPage.getPageTitle()).isEqualTo("Sign Up");
        signUpPage.inputUserName(user.getUserName());
        signUpPage.inputEmail(user.getEmail());
        signUpPage.inputPassword(user.getPassword());




    }


}
