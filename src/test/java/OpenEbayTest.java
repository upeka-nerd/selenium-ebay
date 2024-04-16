import org.example.pageClasses.EbayHomePage;
import org.example.pageClasses.MobileResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenEbayTest {

    private WebDriver webDriver;
    private EbayHomePage ebayHomePage;
    private MobileResultPage mobileResultPage;


    @BeforeTest
    public void navigateToEbay(){
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        ebayHomePage=new EbayHomePage(webDriver);
        ebayHomePage.setUpHomePage();

    }
    
    @Test(priority = 0)
    public void navigateTest(){
        String url = ebayHomePage.homePageUrl();
        Assert.assertEquals(url, "https://www.ebay.com/",
                "Wrong url!,navigation failed..");

    }
    @Test(priority = 1)
    public void selectCategory(){

        String selectedUrl = ebayHomePage.categorySelect();
        Assert.assertEquals(selectedUrl, "https://www.ebay.com/b/Cell-Phones-Smart" +
                        "-Watches-Accessories/15032/bn_1865441",
                "Wrong selected!");

    }

    @Test(priority = 3)
    public void searchMobilePhone(){
        ebayHomePage.findMobiles();

    }

    @Test(priority = 4)
    public void search(){
        mobileResultPage=new MobileResultPage(webDriver);
        mobileResultPage.serachResults();


    }





    

































}
