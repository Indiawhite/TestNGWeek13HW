package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

    public class ReasonForTravelPage  extends Utility {
        WebDriver driver;

        @FindBy(id = "nextStep")
        WebElement nextStepButton;

        @FindBy(name = "reasonForVisit")
        List<WebElement> reasonForVisitList;

        public ReasonForTravelPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectReasonForVisit(String reason) {
            for (WebElement reasonOption : reasonForVisitList) {
                if (reasonOption.getText().equalsIgnoreCase(reason)) {
                    reasonOption.click();
                    break;
                }
            }
        }

        public void clickNextStepButton() {
            nextStepButton.click();
        }
    }


