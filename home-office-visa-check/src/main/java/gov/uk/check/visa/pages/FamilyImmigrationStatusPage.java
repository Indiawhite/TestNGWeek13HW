package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class FamilyImmigrationStatusPage  extends Utility {
        WebDriver driver;

        @FindBy(id = "nextStep")
        WebElement nextStepButton;

        @FindBy(id = "yes")
        WebElement yes;

        @FindBy(id = "no")
        WebElement no;

        public FamilyImmigrationStatusPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectImmigrationStatus(String status) {
            switch (status.toLowerCase()) {
                case "yes":
                    yes.click();
                    break;
                case "no":
                    no.click();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid status: " + status);
            }
        }

        public void clickNextStepButton() {
            nextStepButton.click();
        }
    }




