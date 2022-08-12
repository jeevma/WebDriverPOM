package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicCrmLoginPage {

    public static void main(String[] args) {

        By username = By.name("username");
        By password = By.name("password");
        By login = By.cssSelector("input[value='Login']");

        DriverFactory df = new DriverFactory();
        WebDriver driver = df.init_driver("chrome");
        df.launchUrl("https://classic.crmpro.com/index.html");
        System.out.println(df.doGetPageTitle());

        ElementUtils elementutil = new ElementUtils(driver);

        elementutil.doSendKeys(username, "sanjiv");
        elementutil.doSendKeys(password, "Tester123");
        elementutil.doClick(login);
        df.closeBrowser();



    }
}
