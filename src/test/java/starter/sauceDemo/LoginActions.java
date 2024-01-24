package starter.sauceDemo;

import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions{
    
    public void as(String username, String password) {
        openUrl("https://saucedemo.com");

        find("[data-test='username']").sendKeys(username);
        find("[data-test='password']").sendKeys(password);
        find("[data-test='login-button']").click();
    }
}
