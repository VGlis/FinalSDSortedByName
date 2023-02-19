package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductsPage {

    public WebDriver driver;

    public ProductsPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public boolean isOpen() {
        String url = driver.getCurrentUrl();

        if(url.equals("https://www.saucedemo.com/inventory.html")) {
            return true;
        }
        else {
            return false;
        }

    }

    public void close() {
        driver.close();
        driver.quit();
    }


    public void sortByName (String sortByName) {
        WebElement sortContainer = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));

        sortContainer.click();

        List<WebElement> options = sortContainer.findElements(By.xpath(".//option"));

        for(int i = 0; i < options.size(); i++) {
            String optionText = options.get(i).getText();
            if(optionText.equals(sortByName)) {
                options.get(i).click();
                break;
            }
        }
    }


    public boolean isProductSortFromAZ() {
        boolean toReturn = false;
        WebElement container = driver.findElement(By.id("inventory_container"));
        List<WebElement> listInventoryItems = container.findElements(By.xpath(".//div[@class='inventory_item']"));


        String[] actual = new String[listInventoryItems.size()];
        String[] sorted = new String[listInventoryItems.size()];

        for (int i = 0; i < listInventoryItems.size(); i++)
        {
            WebElement itemNames = listInventoryItems.get(i).findElement(By.xpath(".//div[@class='inventory_item_name']"));
            actual[i] = sorted[i] =  itemNames.getText();
        }

        //Sorting the array - ascending order - (A - Z)
        Arrays.sort(sorted);

        //Validating the existing with sorted array. shows message if both are same

        for(int i = 0; i < listInventoryItems.size(); i++)
        {
            int z = i + 1;
            if(actual[i].equals(sorted[i]))
            {
                System.out.println("|| Expected: "+sorted[i]+" || Actual: "+actual[i]+" || at row "+ z);
                toReturn = true;
            }
        }


        return toReturn;

    }

    public boolean isProductSortFromZA() {
        boolean toReturn = false;
        WebElement container = driver.findElement(By.id("inventory_container"));
        List<WebElement> listInventoryItems = container.findElements(By.xpath(".//div[@class='inventory_item']"));


        String[] actual = new String[listInventoryItems.size()];
        String[] sorted = new String[listInventoryItems.size()];

        for (int i = 0; i < listInventoryItems.size(); i++)
        {
            WebElement itemNames = listInventoryItems.get(i).findElement(By.xpath(".//div[@class='inventory_item_name']"));
            actual[i] = sorted[i] =  itemNames.getText();
        }

        //Sorting the array reverseOrder() - descending order - (Z - A)
        Arrays.sort(sorted, Collections.reverseOrder());


        //Validating the existing with sorted array. shows  message if both are same

        for(int i = 0; i < listInventoryItems.size(); i++)
        {
            int z = i + 1;
            if(actual[i].equals(sorted[i]))
            {
                System.out.println("|| Expected: "+sorted[i]+" || Actual: "+actual[i]+" || at row "+ z);
                toReturn = true;
            }
        }


        return toReturn;

    }


    public List<String> isProductSortFromAZ_Array_ListString_Actual() {
        List<String> AZ_Array_actual  = new ArrayList<>();
        WebElement container = driver.findElement(By.id("inventory_container"));
        List<WebElement> listInventoryItems = container.findElements(By.xpath(".//div[@class='inventory_item']"));

        for (int i = 0; i < listInventoryItems.size(); i++)
        {
            WebElement itemNames = listInventoryItems.get(i).findElement(By.xpath(".//div[@class='inventory_item_name']"));
            AZ_Array_actual.add(itemNames.getText());
        }

        return AZ_Array_actual;
    }


    public boolean isProductSortFromAZ_Array() {
        List<String> AZ_Array_actual  = new ArrayList<>();
        List<String> AZ_Array_sorted  = new ArrayList<>();
        AZ_Array_sorted.add("Sauce Labs Backpack");
        AZ_Array_sorted.add("Sauce Labs Bike Light");
        AZ_Array_sorted.add("Sauce Labs Bolt T-Shirt");
        AZ_Array_sorted.add("Sauce Labs Fleece Jacket");
        AZ_Array_sorted.add("Sauce Labs Onesie");
        AZ_Array_sorted.add("Test.allTheThings() T-Shirt (Red)");

        Collections.sort(AZ_Array_sorted);


        boolean toReturn = false;
        WebElement container = driver.findElement(By.id("inventory_container"));
        List<WebElement> listInventoryItems = container.findElements(By.xpath(".//div[@class='inventory_item']"));


        for (int i = 0; i < listInventoryItems.size(); i++)
        {
            WebElement itemNames = listInventoryItems.get(i).findElement(By.xpath(".//div[@class='inventory_item_name']"));
            AZ_Array_actual.add(itemNames.getText());
        }

        System.out.println("Array_actual:    " + AZ_Array_actual);
        System.out.println("AZ_Array_sorted: " + AZ_Array_sorted);

        if (AZ_Array_actual.equals(AZ_Array_sorted)){
           toReturn = true;
        }
        return toReturn;
    }

    public boolean isProductSortFromZA_Array() {
        List<String> ZA_Array_actual  = new ArrayList<>();
        List<String> ZA_Array_sorted  = new ArrayList<>();

        ZA_Array_sorted.add("Test.allTheThings() T-Shirt (Red)");
        ZA_Array_sorted.add("Sauce Labs Onesie");
        ZA_Array_sorted.add("Sauce Labs Fleece Jacket");
        ZA_Array_sorted.add("Sauce Labs Bolt T-Shirt");
        ZA_Array_sorted.add("Sauce Labs Bike Light");
        ZA_Array_sorted.add("Sauce Labs Backpack");

        Collections.sort(ZA_Array_sorted, Collections.reverseOrder());


        boolean toReturn = false;
        WebElement container = driver.findElement(By.id("inventory_container"));
        List<WebElement> listInventoryItems = container.findElements(By.xpath(".//div[@class='inventory_item']"));


        for (int i = 0; i < listInventoryItems.size(); i++)
        {
            WebElement itemNames = listInventoryItems.get(i).findElement(By.xpath(".//div[@class='inventory_item_name']"));
            ZA_Array_actual.add(itemNames.getText());
        }

        System.out.println("Array_actual:    " + ZA_Array_actual);
        System.out.println("ZA_Array_sorted: " + ZA_Array_sorted);

        if (ZA_Array_actual.equals(ZA_Array_sorted)){
            toReturn = true;
        }
        return toReturn;
    }


}
