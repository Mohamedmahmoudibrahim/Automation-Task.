package TestCases;

import Data.JasonDataReader;
import Pages.HomePage;
import Pages.RegistraionPage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserRegistrationTest extends TestBase{

    HomePage homeObject ;
    RegistraionPage registraionObject;

    @Test
    public void userRegistersuccesfully () throws IOException, ParseException {
        JasonDataReader jsonRead = new JasonDataReader();
        jsonRead.JsonReader();
        homeObject = new HomePage(driver);
        homeObject.OpenRegiterationPage ();
        registraionObject = new RegistraionPage(driver);
        registraionObject.userRegistration (jsonRead.firstName, jsonRead.lastName, jsonRead.email, jsonRead.password);
        Assert.assertTrue(registraionObject.sucessMessage.getText().contains("Your registration completed"));

    }


}
