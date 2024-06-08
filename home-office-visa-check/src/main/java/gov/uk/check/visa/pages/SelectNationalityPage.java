package gov.uk.check.visa.pages;



import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

    public class SelectNationalityPage  extends Utility {
        WebDriver driver;

        @FindBy(id = "nationalityDropDown")
        WebElement nationalityDropDownList;

        @FindBy(id = "nextStep")
        WebElement nextStepButton;

        public SelectNationalityPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectNationality(String nationality) {
            nationalityDropDownList.sendKeys(nationality);
        }

        public void clickNextStepButton() {
            nextStepButton.click();
        }
    }


