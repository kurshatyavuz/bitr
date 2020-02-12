package com.bitrix.pages.login_navigation;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@class='login-inp'][@type='text']")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@class='login-inp'][@type='password']")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(className="login-btn")
    public WebElement loginButtonElement;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeElement;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPasswordElement;

//    @FindBy(tagName = "h2")
//    public WebElement titleElement;

    @FindBy(className = "errortext")
    public WebElement errorMessageElement;


    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }


    public void login(String role){

        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("help desk")){
            username = ConfigurationReader.getProperty("helpdeskusername");
            password = ConfigurationReader.getProperty("helpdeskpassword");
        }else if (role.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketingusername");
            password = ConfigurationReader.getProperty("marketingpassword");
        }else if (role.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hrusername");
            password = ConfigurationReader.getProperty("hrpassword");
        }

        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

    }







    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public void clickRememberMe(){
        BrowserUtils.waitForClickablility(rememberMeElement, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        if(!rememberMeElement.isSelected()){
            rememberMeElement.click();
        }
    }


    public void goToLandingPage(){
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"+ConfigurationReader.getProperty("environment")));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


}
