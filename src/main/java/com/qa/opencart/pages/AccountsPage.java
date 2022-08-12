package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {

    private WebDriver driver;

    private By header = By.cssSelector("[alt='My Store']");
    private By firstHeaderTab = By.cssSelector("a[title='Women']");
    private By searchBar = By.cssSelector("[name='search_query']");
    private By accountSectionHeaders = By.cssSelector(".addresses-lists");

    public AccountsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAccountsPageTitle() {
        return driver.getTitle();
    }
    public String getHeaderValue(){
            if (driver.findElement(header).isDisplayed()) {
                return driver.findElement(header).getText();
            }
            return null;
    }

    public int getAccountSectionsCount() {
        return driver.findElements(accountSectionHeaders).size();
    }

    public List<String>getAccountSectionsList() {
        List<String> accountsList = new ArrayList<>();
        List<WebElement> accSectionList = driver.findElements(accountSectionHeaders);

        for (WebElement e: accSectionList) {
            String section = e.getText();
            System.out.println(section);
            accountsList.add(section);
        }
        return accountsList;
    }


}
