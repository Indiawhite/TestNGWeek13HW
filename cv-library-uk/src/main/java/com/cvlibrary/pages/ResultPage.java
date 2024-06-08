package com.cvlibrary.pages;

import com.cvlibrary.driverfactory.ManageDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends ManageDriver {
    WebDriver driver;

    @FindBy(className = "search-header__title")
    WebElement resultText;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyTheResults(String expected) {
        if (resultText.getText().contains(expected)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

}
