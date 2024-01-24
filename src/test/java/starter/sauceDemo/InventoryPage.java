package starter.sauceDemo;

import net.serenitybdd.core.pages.PageObject;

public class InventoryPage extends PageObject {
    
    public String getHeading() {
        //return $(".title").getText(); --another way
        return find(".title").getText();
    }
}
