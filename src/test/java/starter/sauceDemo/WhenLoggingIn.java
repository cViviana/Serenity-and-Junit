package starter.sauceDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;



@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIn {
    
    @Managed
    WebDriver driver;

    @Test
    public void userCanLoginViaTheHomePage() {
        driver.get("https://saucedemo.com");

        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();

        assertEquals(driver.findElement(By.cssSelector(".title")).getText(),"Products");
    }
}