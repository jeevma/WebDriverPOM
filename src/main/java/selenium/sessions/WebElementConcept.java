package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementConcept {
    static WebDriver driver;
    public static void main(String[] args) {
        DriverFactory cb = new DriverFactory();
        driver = cb.init_driver("chrome");

        //WebDriverManager.chromedriver().setup();

        //driver = new ChromeDriver();

        driver.get("https://login.mailchimp.com/signup/");

        //get the element - by using locator

        //1. id:
        // get the "Add Item" element
        //By locators
        By email = By.id("email");
        By password = By.id("new_password");
        By username = By.name("username");
        By signup = By.cssSelector("button#create-account-enabled");

        //driver.findElement(email).sendKeys("learnsanjeev@gmail.com");
        //driver.findElement(username).click();
        //driver.findElement(password).sendKeys("Br@@ke123");
        //driver.findElement(signup).click();

        //WebElement email_ele = driver.findElement(email);
        //WebElement username_ele = driver.findElement(username);
        //WebElement password_ele = driver.findElement(password);
        //WebElement signup_ele = driver.findElement(signup);

        //email_ele.sendKeys("sanjeev.mathurr@gmail.com");
        //username_ele.click();
        //password_ele.sendKeys("brooke123");

        //getElement(email).sendKeys("sanjeev.mathurr@gmail.com");
        //getElement(username).click();
        //getElement(password).sendKeys("brooke");



    }

}
