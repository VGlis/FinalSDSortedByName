package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import java.util.Collections;
import java.util.List;

public class ProductsTests {

    @Test
    public void verifySortProductByNameAZ() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.sortByName( "Name (A to Z)");

        boolean isSortedByNameAZ = productsPage.isProductSortFromAZ();

        if(isSortedByNameAZ) {
            System.out.println("|| Sorting is as expected ||");
        }
        else {
            System.out.println("|| Sorting is not as expected ||");
        }

        Assert.assertEquals(isSortedByNameAZ, true, "Products are not sorted as expected, from Name (A to Z)");

        productsPage.close();
    }

    @Test
    public void verifySortProductByNameZA() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.sortByName( "Name (Z to A)");

        boolean isProductSortFromZA = productsPage.isProductSortFromZA();

        if(isProductSortFromZA) {
            System.out.println("|| Sorting is as expected ||");
        }
        else {
            System.out.println("|| Sorting is not as expected ||");
        }

        Assert.assertEquals(isProductSortFromZA, true, "Products are not sorted as expected, from Name (Z to A)");

        productsPage.close();
    }


    @Test
    public void verifySortProductByNameAZ_Array() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.sortByName( "Name (A to Z)");

        boolean isSortedByNameAZ = productsPage.isProductSortFromAZ_Array();

        if(isSortedByNameAZ) {
            System.out.println("|| Sorting is as expected ||");
        }
        else {
            System.out.println("|| Sorting is not as expected ||");
        }

        Assert.assertEquals(isSortedByNameAZ, true, "Products are not sorted as expected, from Name (A to Z)");

        productsPage.close();
    }

    @Test
    public void verifySortProductByNameZA_Array() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.sortByName( "Name (Z to A)");

        boolean isSortedByNameAZ = productsPage.isProductSortFromZA_Array();

        if(isSortedByNameAZ) {
            System.out.println("|| Sorting is as expected ||");
        }
        else {
            System.out.println("|| Sorting is not as expected ||");
        }

        Assert.assertEquals(isSortedByNameAZ, true, "Products are not sorted as expected, from Name (A to Z)");

        productsPage.close();
    }


    @Test
    public void verifySortProductByNameAZ_Array_compare() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        List actual = productsPage.isProductSortFromAZ_Array_ListString_Actual();
        Collections.sort(actual);
        System.out.println("|| actual: || " + actual);
        productsPage.sortByName( "Name (A to Z)");
        List sorted = productsPage.isProductSortFromAZ_Array_ListString_Actual();
        System.out.println("|| sorted: || " + sorted);

        Assert.assertEquals(actual, sorted, "Products are not sorted as expected, from Name (A to Z)");

        productsPage.close();
    }

    @Test
    public void verifySortProductByNameZA_Array_compare() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);
        List actual = productsPage.isProductSortFromAZ_Array_ListString_Actual();
        Collections.sort(actual, Collections.reverseOrder());
        System.out.println("|| actual_reverseOrder: || " + actual);
        productsPage.sortByName( "Name (Z to A)");
        List sorted = productsPage.isProductSortFromAZ_Array_ListString_Actual();
        System.out.println("|| sorted_reverseOrder: || " + sorted);

        Assert.assertEquals(actual, sorted, "Products are not sorted as expected, from Name (Z to A)");

        productsPage.close();
    }
    @Test
    public void verifySortProductByNameAZ_Array_TOcompare() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.sortByName( "Name (A to Z)");
        productsPage.ProductSortFromAZ_toCompare();

        Assert.assertEquals( productsPage.ProductSortFromAZ_toCompare(), true, "Products are not sorted as expected, from Name (A to Z)");

        productsPage.close();

    }
    @Test
    public void verifySortProductByNameZA_Array_TOcompare() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vladan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.sortByName( "Name (Z to A)");
        productsPage.ProductSortFromZA_toCompare();

        Assert.assertEquals( productsPage.ProductSortFromZA_toCompare(), true, "Products are not sorted as expected, from Name (Z to A)");

        productsPage.close();

    }

}
