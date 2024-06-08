package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class DurationOfStayPage extends Utility {
        WebDriver driver;

        @FindBy(id = "nextStep")
        WebElement nextStepButton;

        @FindBy(id = "lessThanSixMonths")
        WebElement lessThanSixMonths;

        @FindBy(id = "moreThanSixMonths")
        WebElement moreThanSixMonths;

        public DurationOfStayPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectLengthOfStay(String moreOrLess) {
            switch (moreOrLess.toLowerCase()) {
                case "less than six months":
                    lessThanSixMonths.click();
                    break;
                case "more than six months":
                    moreThanSixMonths.click();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid duration: " + moreOrLess);
            }
        }

        public void clickNextStepButton() {
            nextStepButton.click();
        }
    }


