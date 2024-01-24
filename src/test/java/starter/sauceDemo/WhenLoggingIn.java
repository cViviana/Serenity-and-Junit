package starter.sauceDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;



@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIn extends UIInteractions {
    
    @Managed
    WebDriver driver;

    @Test
    public void userCanLoginViaTheHomePage() {
        openUrl("https://saucedemo.com");

        find("[data-test='username']").sendKeys("standard_user");
        find("[data-test='password']").sendKeys("secret_sauce");
        find("[data-test='login-button']") .click();

        assertEquals(find(".title").getText(),"Products");
    }
}