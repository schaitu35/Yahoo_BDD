package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locators.All_locators;
import org.junit.Assert;
import org.openqa.selenium.By;

public class stepDefinitions extends TestBase{

    @Given("^Launch the browser and navigate to Yahoo login page$")
    public void launch_the_browser_and_navigate_to_yahoo_login_page() {
        initializeDriver();
    }


    @Given("^user in Yahoo Yahoo Mail Mail Home Pag$")
    public void user_in_yahoo_yahoo_mail_mail_home_pag() {
        Assert.assertTrue( driver.findElement(By.xpath(All_locators.yahoo_Mail_Img)).isDisplayed());
    }



    @Then("^user click on \"([^\"]*)\" button$")
    public void user_click_on_something_button(String strArg1) {
        driver.findElement(By.xpath(All_locators.composeBtn)).click();
    }

    @Then("^a frame to compose mail gets displayed$")
    public void a_frame_to_compose_mail_gets_displayed() {
        Assert.assertTrue( driver.findElement(By.xpath(All_locators.sendBtn)).isDisplayed());

    }

    @Then("^user will enter \"([^\"]*)\" in sender text box$")
    public void user_will_enter_something_in_sender_text_box(String strArg1) {
        driver.findElement(By.xpath(All_locators.toField)).sendKeys(strArg1);
    }

    @Then("^user will enter the \"([^\"]*)\" in Subject text box$")
    public void user_will_enter_the_something_in_subject_text_box(String strArg1) {
        driver.findElement(By.xpath(All_locators.subjectField)).sendKeys(strArg1);
    }

    @Then("^user will enter the \"([^\"]*)\" in mail body$")
    public void user_will_enter_the_something_in_mail_body(String strArg1) {
        driver.findElement(By.xpath(All_locators.messageBody)).sendKeys(strArg1);
    }

    @Then("^user will clicks on view message$")
    public void user_will_clicks_on_view_mail() {
        driver.findElement(By.xpath(All_locators.view_message)).click();
    }

    @Then("^user will be navigated to sent mail$")
    public void user_will_be_navigated_to_sent_mail() {
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.reply_Btn)).isDisplayed());
    }

    @Then("^error message should be displayed$")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.error_Msg)).isDisplayed());
        driver.findElement(By.xpath(All_locators.error_Msg_Close_Btn)).click();
    }

    @Then("^upon clicking Ok button$")
    public void upon_clicking_ok_button() {
        
    }

    @Then("^user will clicks on \"([^\"]*)\" popup$")
    public void user_will_clicks_on_something_popup(String strArg1) {
        
    }

    @Then("^user can able to see undo Mail button at bottom$")
    public void user_can_able_to_see_undo_mail_button_at_bottom() {
        
    }

    @Then("^user will clicks on undo mail$")
    public void user_will_clicks_on_undo_mail() {
        
    }

    @Then("^user clicks on close button$")
    public void user_clicks_on_close_button() {
        driver.findElement(By.xpath(All_locators.delete_Btn)).click();
    }

    @Then("^user clicks on minimize button$")
    public void user_clicks_on_minimize_button() {
        
    }

    @Then("^user clicks on maximize button$")
    public void user_clicks_on_maximize_button() {
        
    }

    @Then("^user clicks on discard button$")
    public void user_clicks_on_discard_button() {
        
    }

    @Then("^user clicks on vertical dots$")
    public void user_clicks_on_vertical_dots() {
        driver.findElement(By.xpath(All_locators.options_button)).click();
    }

    @Then("^options menu should appear$")
    public void options_menu_should_appear() {
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.options_Menu)).isDisplayed());
    }

    @And("^user will clicks on send button$")
    public void user_will_clicks_on_send_button() {
        driver.findElement(By.xpath(All_locators.sendBtn)).click();

    }

    @And("^user can enter email Ids in ‘To’, ‘cc’ and ‘bcc’$")
    public void user_can_enter_email_ids_in_to_cc_and_bcc() {
        driver.findElement(By.xpath(All_locators.bcc_Text_field)).sendKeys("Test_CC");
        driver.findElement(By.xpath(All_locators.cc_Text_field)).sendKeys("Test_BCC");

    }

    @Then("user enters {string} as username and {string} as password and clicks on login button")
    public void userEntersAsUsernameAndAsPasswordAndClicksOnLoginButton(String username, String password) {

        LoginPage.userLogin(username, password);
    }

    @Then("^warning pop up should be visible for sending a mail without subject$")
    public void warning_pop_up_should_be_visible_for_sending_a_mail_without_subject() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.warning_pop_up_Ok)).isDisplayed());
    }

    @Then("^user clicks on ok button$")
    public void user_clicks_on_ok_button() throws Throwable {
        driver.findElement(By.xpath(All_locators.warning_pop_up_Ok)).click();
    }

    @Then("‘cc’ and ‘bcc’ fields should be visible")
    public void ccAndBccFieldsShouldBeVisible() {
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.bcc_Text_field)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(All_locators.cc_Text_field)).isDisplayed());
    }

    @Then("user clicks on Cc,Bcc button to enable fields")
    public void userClicksOnCcBccButtonToEnableFields() {
        driver.findElement(By.xpath(All_locators.cc_Bcc_btn)).click();
    }
}
