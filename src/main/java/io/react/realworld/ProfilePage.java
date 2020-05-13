package io.react.realworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by neste on 13.05.2020.
 */
public class ProfilePage extends BasePage {

    private By article = By.cssSelector("");
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public int getArticleSize (){
        return driver.findElements(article).size();
    }

}
