package generic_methods;

import base.BasePage;
import driver_factory.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project_global_variables.GlobalVariables;


public class GenericMethods{
    private WebDriver driver;
    private WebDriverWait wait;
    private String currentApplication;


    public GenericMethods(){
        driver = DriverFactory.getDriver();
        wait = BasePage.getDefaultWait();
    }
    // #################### APPLICATION MODIFIERS ####################
    public void openUrl(String url){
        driver.get(url);
        writeOnScren("We are executing automated tests on: " + url + " application");
    }
    // ###################### WRITE METHODS ######################
    public static void writeOnScren(String message){
        System.out.println(message);
    }

    public void saveText(String key, String value){
        GlobalVariables.textManager.put(key, value);
    }

    public String returnText(String key){
        return GlobalVariables.textManager.get(key);
    }

    public void clearHashMap(){
        GlobalVariables.textManager.clear();
    }
    // ###################### WAIT METHODS ######################
    public void sleep(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validateVisibilityOfElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // ###################### CLICK METHODS ######################
    public void click(WebElement element){
        highlight(element);
        element.click();
    }

    public void jsClick(WebElement element){
        highlight(element);
        executeJavaScript("arguments[0].click();", element);
    }

    // ###################### SEND KEYS METHODS ######################
    public void sendKeys(WebElement element, String text){
        highlight(element);
        element.sendKeys(text);
    }

    // ###################### JS GENERIC METHODS ###########################
    public Object executeJavaScript(String comand, Object... parameter){
        return ((JavascriptExecutor)driver).executeScript(comand,parameter);
    }

    public void highlight(WebElement element){
        executeJavaScript("arguments[0].style.border = arguments[1]", element, "solid 4px red");
    }

    // ###################### EXPECTED CONDITIONS METHODS ###########################
    public boolean isElementVisible(WebElement element){
        boolean visibility = false;
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            visibility = true;
        }catch (Exception e){

        }
        return visibility;
    }
}
