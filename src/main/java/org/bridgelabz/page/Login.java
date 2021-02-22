package org.bridgelabz.page;
import org.bridgelabz.base.Base;
import org.bridgelabz.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends Base {

    @FindBy(xpath = "//INPUT[@id='email']")WebElement emailId;
    @FindBy(how= How.XPATH , using = "//INPUT[@id='pass']")WebElement emailPassword;
    @FindBy(how = How.XPATH,using = "//BUTTON[@id='loginbutton']")WebElement loginbutton;


    public Login(WebDriver driver) {
        this.driver = driver;
    }
    private static final String EXCEL_PATH = "C:\\Users\\ankit\\Desktop\\newdatadrivenframework" +
            "\\src\\test\\resources\\Data.xlsx";

    public void loginToFacebook() throws InterruptedException {

        String username = Utility.getProperty("username");
        emailId.sendKeys(username);
        Thread.sleep(3000);
        String password = Utility.getProperty("password");
        emailPassword.sendKeys(password);
        Thread.sleep(1000);
        loginbutton.click();
        Thread.sleep(2000);
    }
}
