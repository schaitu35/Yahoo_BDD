package locators;

public interface All_locators {

    // Login Page
    String username_textBox = "login-username";
    String password_textBox = "#login-passwd";
    String mail_Icon = "//a[@id='header-mail-button']";
    String composeBtn = "//a[normalize-space()='Compose']";
    String sendBtn = "//span[normalize-space()='Send']";
    String toField = "//input[@id='message-to-field']";
    String subjectField = "//input[@placeholder='Subject']";
    String messageBody = "//div[@aria-label='Message body']";
    String yahoo_Mail_Img = "//img[@class='_yb_75uw5 _yb_ed7iw']";
    String delete_Btn = "//button[@title='Delete this draft']";
    String view_message = "//span[normalize-space()='message']";
    String reply_Btn = "//button[normalize-space()='Reply']";
    String error_Msg = "//div[contains(@role,'presentation')]";
    String error_Msg_Close_Btn = "//button[contains(@title,'Close notification')]";
    String warning_pop_up_Ok = "//button[contains(text(),'Send')]";
    String warning_pop_up_Cancel = "//button[contains(text(),'Cancel')]";
    String options_button = "//button[contains(@title,'More options')]";
    String options_Menu = "//ul[contains(@role,'menu')]";
    String cc_Bcc_btn = "//button[normalize-space()='Cc / Bcc']";
    String hide_cc_Bcc_btn = "//button[normalize-space()='Hide Cc / Bcc']";
    String cc_Text_field = "//input[@id='message-cc-field']";
    String bcc_Text_field = "//input[@id='message-bcc-field']";

}
