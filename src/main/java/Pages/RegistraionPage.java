package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistraionPage extends PageBase {


    public RegistraionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "gender-male")
    WebElement genderBtn ;

    @FindBy (id = "FirstName")
    WebElement fnTxtBox;

    @FindBy(id = "LastName")
    WebElement lnTxtBox ;

    @FindBy (id = "Email")
    WebElement emailTxtBox ;

    @FindBy (id = "Password")
    WebElement passwordTxtBox;

    @FindBy (id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;

    @FindBy (id = "register-button")
    WebElement registerBtn ;

    @FindBy (css = "div.result")
   public WebElement sucessMessage ;


    public void userRegistration (String firstName , String lastName , String email, String password) {
        clickButton(genderBtn);
        setTxt(fnTxtBox,firstName);
        setTxt(lnTxtBox,lastName);
        setTxt(emailTxtBox,email);
        setTxt(passwordTxtBox,password);
        setTxt(confirmPasswordTxtBox,password);
        clickButton(registerBtn);
    }



}
