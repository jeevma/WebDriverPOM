package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
    private WebDriver driver;

    //Constructor
    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void doSendKeys(By locator, String value){
        getElement(locator).sendKeys(value);
    }

    public void doClick(By locator){
        getElement(locator).click();
    }
}
