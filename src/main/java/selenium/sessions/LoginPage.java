package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //private static WebDriver driver;
    public static void main(String[] args) {

        String browserName = "chrome";

        By email = By.id("email");
        By password = By.id("new_password");
        By username = By.name("username");
        By signup = By.cssSelector("button#create-account-enabled");

        DriverFactory df = new DriverFactory();
        WebDriver driver = df.init_driver(browserName);
        df.launchUrl("https://login.mailchimp.com/signup/");
        System.out.println(df.doGetPageTitle());

        ElementUtils elementutil = new ElementUtils(driver);

        elementutil.doSendKeys(email, "sanjeev.mathurr@gmail.com");
        elementutil.doClick(username);
        elementutil.doSendKeys(password, "Tester@123");
        //doSendKeys(email, "sanjeev.mathurr@gmail.com");

    }
}
