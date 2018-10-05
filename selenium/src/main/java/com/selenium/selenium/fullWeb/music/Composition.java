package com.selenium.selenium.fullWeb.music;

import com.selenium.selenium.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Composition extends PageObject {

    @FindBy ( css = "div.aplayer:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
    public WebElement indianSong;

    @FindBy ( css = "div.aplayer:nth-child(4) > div:nth-child(1) > div:nth-child(1)")
    public WebElement videoGameSong;

    @FindBy ( css = "div.aplayer:nth-child(6) > div:nth-child(1) > div:nth-child(1)")
    public WebElement redBullSong;

    public Composition(WebDriver driver) {
        super(driver);
    }
}
