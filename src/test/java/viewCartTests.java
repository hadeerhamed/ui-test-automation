import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

import java.util.ArrayList;
import java.util.List;

public class viewCartTests extends BaseTest{

    CartPage cartPage;
    @BeforeMethod
    public void addToCartItem(){
       ProductPage productPage=new ProductPage(driver);
        productPage.addProduct();
  cartPage =  productPage.clickViewCartButton();
    }
    @Test
    public void checkColumnsHeader(){
        Assert.assertEquals(cartPage.getNumOfHeader(),6,"The number of Headers should be 6");
        List<String>headers=new ArrayList<>();
        headers.add("Item");
        headers.add("Description");
        headers.add("Price");
        headers.add("Quantity");
        headers.add("Total");
        headers.add("Remove");
        Assert.assertTrue(cartPage.getHeaderText(headers));
    }
}
