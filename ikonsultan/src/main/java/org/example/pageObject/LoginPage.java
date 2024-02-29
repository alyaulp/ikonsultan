package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = (driver);
    }

    @FindBy(xpath = "//section[@id='login']//div[@class='row']")
    private WebElement loginPage;

    @FindBy(xpath = "//div[3]")
    private WebElement landingPage;

    @FindBy(xpath = "//input[@value='John Doe']")
    private WebElement getUsername;

    @FindBy(xpath = "//input[@value='ThisIsNotAPassword']")
    private WebElement getPassword;

    @FindBy(xpath = "//input[@id='txt-username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='txt-password']")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    public void setUsername(String user){
        userName.sendKeys(user);
    }


    public String getUsername(){
        return getUsername.getAttribute("value");
    }

    public String getPassword(){
        return getPassword.getAttribute("value");
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean verifyLoginPage() { // bener bner tapil dlm keadaan true / di login page
        loginPage.isDisplayed();
        return true;
    }

    public boolean verifyLandingPage() { // bener bner tapil dlm keadaan true / di login page
        landingPage.isDisplayed();
        return true;
    }

}