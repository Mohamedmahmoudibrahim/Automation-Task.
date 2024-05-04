package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

public WebDriver driver ;

    public PageBase (WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void setTxt(WebElement Txt ,String value ) {
      Txt.sendKeys(value);
    }
}
