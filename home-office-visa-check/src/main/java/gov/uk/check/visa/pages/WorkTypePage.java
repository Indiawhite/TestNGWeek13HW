package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

    public class WorkTypePage extends Utility {
        WebDriver driver;

        @FindBy(id = "nextStep")
        WebElement nextStepButton;

        @FindBy(name = "jobType")
        List<WebElement> selectJobtypeList;

        public WorkTypePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void selectJobType(String job) {
            for (WebElement jobType : selectJobtypeList) {
                if (jobType.getText().equalsIgnoreCase(job)) {
                    jobType.click();
                    break;
                }
            }
        }

        public void clickNextStepButton() {
            nextStepButton.click();
        }
    }


