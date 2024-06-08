package gov.uk.check.visa.pages;



import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

    public class ResultPage extends Utility {
        WebDriver driver;

        @FindBy(id = "resultMessage")
        WebElement resultMessage;

        public ResultPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public String getResultMessage() {
            return resultMessage.getText();
        }

        public void confirmResultMessage(String expectedMessage) {
            Assert.assertTrue(resultMessage.getText().contains(expectedMessage), "Expected message not found!");
        }
    }




