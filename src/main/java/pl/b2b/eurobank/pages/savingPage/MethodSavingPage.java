package pl.b2b.eurobank.pages.savingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodSavingPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public MethodSavingPage (WebDriver webDriver, WebDriverWait wait){
       this.webDriver = webDriver;
       this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = DataSavingPage.OTWORZ_RACHUNEK)
    private WebElement otworzRachunek;

    @FindBy(xpath = DataSavingPage.ASERCJA_OSZCZEDNOSCI)
    private  WebElement asercjaOszczednosci;

    public WebElement getAsercjaOszczednosci(){
        return asercjaOszczednosci;
    }
}
