package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchProductPage extends BasePage{
private By searchProd =By.cssSelector(".features_items>h2");
private By firstProduct=By.xpath("//div[@class=\"productinfo text-center\"][1]");
private By relatedSearch =By.xpath("//div[@class=\"productinfo text-center\"]//p[contains(text(),'Top')]");
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }
    public String searchProduct(){
        scrollVertically(500);
      return   getTextOfElement(searchProd);
    }
    public int getRelatedSearch(){
        List< WebElement > productsVisible=locateListOfElement(relatedSearch);
     return    productsVisible.size();
    }
}
