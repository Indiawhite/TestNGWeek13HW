package com.tutorialsninja.testsuite;

import com.tutorialsninja.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    @Test
    public void selectMenu() {
        //1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
        Actions actions = new Actions(driver);
        WebElement Desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement DeskTopTab = driver.findElement(By.xpath("//a[text()='Show AllDesktops']"));
        actions.moveToElement(Desktops).moveToElement(DeskTopTab).click().build().perform();
        String actualMsg = driver.findElement(By.xpath("//a[text()='Desktops']")).getText();
        String expectedMsg = "Desktops";
        Assert.assertTrue(expectedMsg.equalsIgnoreCase(actualMsg));
    }

        //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
      @Test
        public void LaptopAndNoteBooks () {
          WebElement LaptopsAndNotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
          WebElement LaptopNotebookTab = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
         //action.moveToElement(LaptopsAndNotebooks).moveToElement(LaptopNotebookTab).click().build().perform();
          String actualResult = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).getText();
          String expectedResult = "Laptops & Notebooks";
          Assert.assertTrue(expectedResult.equalsIgnoreCase(actualResult));
      }
      @Test
              public void Components(){

            //3.verifyUserShouldNavigateToComponentsPageSuccessfully()
            WebElement Components = driver.findElement(By.xpath("//a[text()='Components']"));
            WebElement ComponentsTab = driver.findElement(By.xpath("//a[text()='Show AllComponents']"));
           // actions.moveToElement(Components).moveToElement(ComponentsTab).click().build().perform();
            String actualResult1 = driver.findElement(By.xpath("//a[text()='Components']")).getText();
            String expectedResult1 = "Components";
            Assert.assertTrue(expectedResult1.equalsIgnoreCase(actualResult1));


        }
    }

