import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class cartQuantityTest extends BaseTest{

    @Test

    public void testQuantityProduct(){
        ProductPage productPage=new ProductPage(driver);
    productPage.addProduct();
 CartPage cartPage   = productPage.clickViewCartButton();
        Assert.assertEquals(cartPage.getProductQuantity(),"1","The should be quantity 1");
    }
}
