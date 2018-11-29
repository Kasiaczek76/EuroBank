package pl.b2b.eurobank.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.eurobank.SingletonWebDriver;
import pl.b2b.eurobank.pages.savingPage.MethodSavingPage;

public class TestHomePage {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private MethodHomePage methodHomePage;
    private MethodSavingPage methodSavingPage;

    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWait();
        methodHomePage = new MethodHomePage(webDriver, wait);
        methodSavingPage = new MethodSavingPage(webDriver, wait);
    }

    @Test
    public void goToRecipientList() {
        methodHomePage.goToRecipientPage();
        Assert.assertEquals(methodHomePage.getAssertion(), "\n" +
                "                            lista odbiorców\n" +
                "                        ");
    }

    @Test
    public void klknijOszczednosci(){
        methodHomePage.clickOszczednosci();

        Assert.assertEquals(methodSavingPage.getAsercjaOszczednosci().getAttribute("innerHTML"),"\n" +
                "                            oszczędności\n" +
                "                        ");
    }

}
