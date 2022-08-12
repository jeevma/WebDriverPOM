package selenium.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardNavigation {

    public static void main(String[] args) {
            //DriverFactory cb = new DriverFactory();
            //WebDriver driver = cb.init_driver("chrome");


            //Setting system properties of ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");

            //Creating an object of ChromeDriver
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");
            String title = driver.getTitle();
            System.out.println("Page Title is: " + title);
            driver.navigate().to("https://amazon.ca");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().back();
            driver.navigate().refresh();
    }
}
