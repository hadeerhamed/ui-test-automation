import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchProductPage;

public class SearchProductTest extends BaseTest{
    @Test
    public void testSearchProduct(){
        ProductPage productPage=new ProductPage(driver);
  SearchProductPage searchProductPage =  productPage.searchInput("Top");

        Assert.assertEquals(searchProductPage.searchProduct(),"SEARCHED PRODUCTS","The Text should be Search Product");

        Assert.assertEquals(searchProductPage.getRelatedSearch(),12,"The related search contain text Top");
    }
    @Test
    public void testSearchProductEnterKey(){
        ProductPage productPage=new ProductPage(driver);
        SearchProductPage searchProductPag  =  productPage.searchEnter("Top");
        Assert.assertEquals(searchProductPag.searchProduct(),"SEARCHED PRODUCTS","The Text should be Search Product");
    Assert.assertEquals(searchProductPag.getRelatedSearch(),12,"The related search contain text Top");

    }

}
