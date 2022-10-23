package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    private By cartMenuHeaders = By.cssSelector(".cart_menu>td");
    private By productQuantity=By.cssSelector("#product-1>.cart_quantity");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getNumOfHeader() {
        List<WebElement> header = locateListOfElement(cartMenuHeaders);
        return header.size();
    }

    public boolean getHeaderText(List<String> expectedHeaderText) {
        List<WebElement> headers = locateListOfElement(cartMenuHeaders);
        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).getText() != expectedHeaderText.get(i))
                { return false;
            }

        }
        return true;
    }
public String getProductQuantity(){
        return getTextOfElement(productQuantity);
}
}