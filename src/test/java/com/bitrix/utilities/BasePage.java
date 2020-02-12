package com.bitrix.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    private static final Logger logger = LogManager.getLogger();


    @FindBy(id = "pagetitle")
    protected WebElement pageSubTitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        //waitUntilLoaderScreenDisappear();
        //BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


}
