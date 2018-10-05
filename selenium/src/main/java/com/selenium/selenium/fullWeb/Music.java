package com.selenium.selenium.fullWeb;

import com.selenium.selenium.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Music extends PageObject {

    @FindBy( css = "div.card-row:nth-child(2) > div:nth-child(1) > img:nth-child(1)")
    public WebElement composition ;

    @FindBy( css = ".container-fluid > img:nth-child(1)")
    public WebElement photos ;

    public Music(WebDriver driver) {
        super(driver);
    }
}
