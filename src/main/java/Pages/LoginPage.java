package Pages;

import Objects.Account;
import org.openqa.selenium.WebDriver;

import static Locators.LoginLocators.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * login function
     *
     * @param account
     */
    public void login(Account account) {
        setText(INPUT_USERNAME, account.getUsername());
        setText(INPUT_PASSWORD, account.getPassword());
        click(BUTTON_LOGIN);
    }
}
