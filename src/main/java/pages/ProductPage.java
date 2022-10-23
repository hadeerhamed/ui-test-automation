package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {


    private By searchFiled = By.id("search_product");
    private By searchBtn = By.id("submit_search");

    private By firstProduct=By.xpath("//div[@class=\"productinfo text-center\"][1]");
    private By clickAddToCart =By.xpath("(//div[@class=\"productinfo text-center\"]/a)[1]");
    private By viewCart=By.xpath("//div[@class=\"modal-body\"]//a");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public SearchProductPage searchInput(String searchText) {

        typeOnInputField(searchFiled, searchText);
        clickElement(searchBtn);

        return new SearchProductPage(driver);

    }

    public SearchProductPage searchEnter(String searchText) {

        typeOnInputField(searchFiled, searchText + Keys.ENTER);
        return new SearchProductPage(driver);


    }
public void addProduct(){
    scrollVertically(600);
    hoverOverElement(firstProduct);
    forceClickOnElement(clickAddToCart);
}

public CartPage clickViewCartButton(){
        clickElement(viewCart);
return new CartPage(driver);
}
}