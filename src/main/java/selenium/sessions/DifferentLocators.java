package selenium.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DifferentLocators {

    public static void main(String[] args) {
        DriverFactory df = new DriverFactory();
        WebDriver driver = df.init_driver("chrome");
        df.launchUrl("https://www.freshworks.com/");
        System.out.println(df.doGetPageTitle());

        //1. id: is always unique
        //2. name: not always unique
        //3. ClassName: is not unique, single element can have multiple class names
        // can't use multiple class names in ClassName locator

        //driver.findElement(By.linkText("Customers")).click();

       List<WebElement> h2TextList =  driver.findElements(By.tagName("h2"));
       //for(int i = 0; i < h2TextList.size(); i++ )
           //System.out.println(i + "--->" + h2TextList.get(i).getText());
       int count = 1;
       for (WebElement e: h2TextList)
           System.out.println((count +1) + "--->" + e.getText());

            count++;


    }


}
