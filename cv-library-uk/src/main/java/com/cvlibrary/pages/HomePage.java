package com.cvlibrary.pages;

import com.cvlibrary.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ManageDriver {
    public By jobTitleField = By.id("keywords");
    public By locationField = By.id("location");
    public By distanceSelect = By.id("distance");
    public By moreSearchOptionsLink = By.id("toggle-hp-search");
    public By salaryMinField = By.id("salarymin");
    public By salaryMaxField = By.id("salarymax");
    public By salaryTypeSelect = By.id("salarytype");
    public By jobTypeSelect = By.id("tempperm");
    public By findJobsButton = By.id("hp-search-btn");

    public HomePage(WebDriver driver) {
        super();

    }


    public void JobSearchPage(WebDriver driver) {
        ManageDriver.driver = driver;
    }

    public void enterJobTitle(String jobTitle) {
        driver.findElement(jobTitleField).sendKeys(jobTitle);
    }

    public void enterLocation(String location) {
        driver.findElement(locationField).sendKeys(location);
    }

    public void selectDistance(String distance) {
        driver.findElement(distanceSelect).sendKeys(distance);
    }

    public void clickMoreSearchOptions() {
        driver.findElement(moreSearchOptionsLink).click();
    }

    public void enterSalaryMin(String salaryMin) {
        driver.findElement(salaryMinField).sendKeys(salaryMin);
    }

    public void enterSalaryMax(String salaryMax) {
        driver.findElement(salaryMaxField).sendKeys(salaryMax);
    }

    public void selectSalaryType(String salaryType) {
        driver.findElement(salaryTypeSelect).sendKeys(salaryType);
    }

    public void selectJobType(String jobType) {
        driver.findElement(jobTypeSelect).sendKeys(jobType);
    }

    public void clickFindJobsButton() {
        driver.findElement(findJobsButton).click();
    }


}
