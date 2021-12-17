package actions.banco_de_series.home_action;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.banco_de_series.home_page.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.By.xpath;
import static project_global_variables.GlobalVariables.SITCOM_TITLE;

public class HomeAction extends HomePage {
    List<WebElement> itemQuantity = new ArrayList<>();
    String path = "";
    String selectedSitcomTitle = "";
    WebElement randomElement;

    public void closeAds(){
        genericMethods.click(closeAdButton);
    }

    public void selectMostWatchedRandomSitcom(){
        setPath("//div[@id = 'myCarouselTOP_SERIES_VISTAS']//div[@class = 'active item']//div[@class = 'thumbnail col-sm-2 col-xs-2']");
        itemQuantity = driver.findElements(xpath(path));
        randomElement = selectRandomItem(itemQuantity.size());
        genericMethods.click(randomElement);
        genericMethods.saveText(SITCOM_TITLE, randomElement.getAttribute("title"));
        System.out.println(selectedSitcomTitle);
        driver.switchTo().frame("aswift_2");
       if(genericMethods.isElementVisible(dismissButton)){
           genericMethods.click(dismissButton);
       }
       driver.switchTo().defaultContent();
    }

    public void clickCreateAccountButton(){
        genericMethods.click(this.createAccountButton);
        Assert.assertTrue(genericMethods.isElementVisible(registerModalTitle));

    }

//    ###### REUSABLES ######
    private void setPath(String additionalPath){
        this.path = path + additionalPath;
    }

    private WebElement selectRandomItem(Integer size){
        int posterItemIndex = new Random().nextInt(size) + 1;
        setPath("["+posterItemIndex+"]/center/a/img");
        return driver.findElement(xpath(path));
    }

    private WebElement getMostWatchedSitcomByName(String path){
        String locator = "//div[@id = 'myCarouselTOP_SERIES_VISTAS']//a/img[contains(@title, '"+path+"')]";
        wait.until(ExpectedConditions.presenceOfElementLocated(xpath(locator)));
        return driver.findElement(xpath(locator));
    }

}
