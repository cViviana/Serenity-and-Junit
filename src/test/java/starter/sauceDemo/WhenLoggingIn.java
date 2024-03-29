package starter.sauceDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;



@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIn{
    
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    @Test
    public void userCanLoginViaTheHomePage() {
        
        login.as(User.STANDARD_USER);
        Serenity.reportThat("The inventory page should include the correct text", 
            ()-> assertEquals(inventoryPage.getHeading(),"Products")
        );
        
    }
}