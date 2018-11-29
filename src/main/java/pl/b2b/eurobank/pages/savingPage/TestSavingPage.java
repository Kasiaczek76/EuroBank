package pl.b2b.eurobank.pages.savingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pl.b2b.eurobank.SingletonWebDriver;
import pl.b2b.eurobank.pages.loginPage.MethodLoginPage;
import pl.b2b.eurobank.pages.paymentPage.MethodRecipient;

public class TestSavingPage {
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

}
