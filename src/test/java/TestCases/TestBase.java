package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {

    public static WebDriver driver ;


    @BeforeClass
    public void startDriver () {

        System.setProperty("webdriver.edge.driver","C:\\Users\\Mohamed.Ibrahim\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver(){

        driver.close();
    }


}
