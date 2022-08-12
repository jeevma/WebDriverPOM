package selenium.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
        private WebDriver driver; //avoid giving unnecessary access
    /**
     * This method is used to initializing the driver on the basis of given browser
     * name
     *
     * @param browserName
     * @return this return WebDriver driver
     */

        public WebDriver init_driver(String browserName) {

            System.out.println("browser name is : " + browserName);

            if (browserName.equals("chrome")) {
                //WebDriverManager.chromedriver().setup();
                //System.out.println(WebDriverManager.chromedriver().getDownloadedDriverPath());
                //Setting system properties of ChromeDriver
                System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");

                //Creating an object of ChromeDriver
                driver = new ChromeDriver();
                //driver = new ChromeDriver();
            }
            else if (browserName.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
                else if (browserName.equals("safari")) {
                driver = new SafariDriver();
            }
            else {
            System.out.println("please pass the correct browser " + browserName);
            }

            //driver.manage().window().fullscreen();
            driver.manage().deleteAllCookies();

            return driver;
        }

        public void launchUrl(String url){
            driver.get(url);
        }

        public String doGetPageTitle(){
            return driver.getTitle();
        }

        public String doGetPageUrl(){
            return driver.getCurrentUrl();
        }

        public void closeBrowser(){
        driver.close();
        }

        public void quitBrowser(){
            driver.quit();
        }

}
