package io.react.realworld;

import org.openqa.selenium.WebDriver;

/**
 * Created by neste on 13.05.2020.
 */
public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
