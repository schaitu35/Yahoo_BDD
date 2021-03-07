package StepDefs;

import locators.All_locators;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends TestBase{

    static void userLogin(String username, String password){
        driver.findElement(By.id(All_locators.username_textBox)).sendKeys(username + Keys.ENTER);
        driver.findElement(By.cssSelector(All_locators.password_textBox)).sendKeys(password + Keys.ENTER);
        driver.findElement(By.xpath(All_locators.mail_Icon)).click();
    }

    @After
    public void afterEachScenario(){
        driver.close();
        driver.quit();
    }
}
