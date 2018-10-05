package com.selenium.selenium.fullWeb;

import com.selenium.selenium.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base extends PageObject {

    @FindBy( css = ".img1")
    public WebElement music ;

    @FindBy( css = ".img2")
    public WebElement developer ;

    public Base(WebDriver driver) {
        super(driver);
    }
}
