package pl.b2b.eurobank.pages.paymentPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pl.b2b.eurobank.SingletonWebDriver;
import pl.b2b.eurobank.pages.loginPage.MethodLoginPage;

public class TestRecipient {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private MethodLoginPage methodLoginPage;
    private MethodRecipient methodRecipient;

    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWait();
        methodRecipient = new MethodRecipient(webDriver, wait);
    }

    @Test(priority = 1)
    @Parameters({"login", "password"})
    public void editRecipient() {
        Assert.assertEquals(methodRecipient.editRecipient(), "\n" + "                        odbiorca - edycja\n" + "                    ");
    }

    @Test(priority = 2)
    @Parameters("tokenNr")
    public void exitEdit(@Optional("123456") String tokenNr) {
        Assert.assertEquals(methodRecipient.exitEdit(tokenNr), "\n" + "                                <i class=\"i-confirmed\"></i>Dane odbiorcy zostały zmienione.\n" + "                            ");
    }

    @AfterClass
    public void quit(){
        webDriver.quit();
    }
}
