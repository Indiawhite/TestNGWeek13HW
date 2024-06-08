package testsuite;

import browserfactory.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test(priority = 2)
    public void login(){
        //1.userShouldLoginSuccessfullyWithValidCredentials
        driver.findElement(By.name("username")).sendKeys("Dpatel");
        driver.findElement(By.name("password")).sendKeys("patel1234");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        String ActualMsg = driver.findElement(By.xpath("//*[text()='Accounts Overview']")).getText();
        String ExpectedMsg = "Accounts Overview";
        Assert.assertEquals("Accounts Overview", ActualMsg, ExpectedMsg);
    }
    @Test(groups = {"sanity"})
    public void errorLogin(){
        driver.findElement(By.name("username")).sendKeys("Dpate");
        driver.findElement(By.name("password")).sendKeys("patel123");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        String ActualMsg = driver.findElement(By.xpath("//*[text()='The username and password could not be verified.']")).getText();
        String ExpectedMsg = "The username and password could not be verified.";
        Assert.assertEquals("The username and password could not be verified.", ActualMsg, ExpectedMsg);

        }
    @Test (groups = {"smoke"})
    public void logOut(){
        driver.findElement(By.name("username")).sendKeys("Dpatel");
        driver.findElement(By.name("password")).sendKeys("patel1234");
        driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
        String ActualMsg = driver.findElement(By.xpath("//*[text()='Accounts Overview']")).getText();
        String ExpectedMsg = "Accounts Overview";
        Assert.assertEquals("Accounts Overview", ActualMsg, ExpectedMsg);
        driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[8]/a")).click();
        String ActualMsg1 = driver.findElement(By.xpath("//*[text()='Customer Login']")).getText();
        String ExpectedMsg1 = "Customer Login";
        Assert.assertEquals("Customer Login", ActualMsg1, ExpectedMsg1);
    }



        }



