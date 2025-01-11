package helpers.methods;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Stream;

public class SendKeysHelper extends GetElementHelper {

    public void sendKeys(String jsonKey, String keys, long timeout, long sleepInMillis) {
        getClickableElement(jsonKey, timeout, sleepInMillis).sendKeys(keys);
    }

    public void sendKeys(String jsonKey, String keys, long timeout) {
        sendKeys(jsonKey, keys, timeout, DEFAULT_SLEEP_IN_MILLIS);
    }

    public void sendKeys(String jsonKey, String keys) {
        sendKeys(jsonKey, keys, DEFAULT_WAIT, DEFAULT_SLEEP_IN_MILLIS);
    }

    public void sendKeys(By by, String keys, long timeout, long sleepInMillis) {
        getClickableElement(by, timeout, sleepInMillis).sendKeys(keys);
    }

    public void sendKeys(By by, String keys, long timeout) {
        sendKeys(by, keys, timeout, DEFAULT_SLEEP_IN_MILLIS);
    }

    public void sendKeys(By by, String keys) {
        sendKeys(by, keys, DEFAULT_WAIT, DEFAULT_SLEEP_IN_MILLIS);
    }

    public void sendKeysCharByChar(By by, String keys) {
        var chars = keys.toCharArray();
        Stream.of(chars).forEach(c -> sendKeys(by, String.valueOf(c)));
    }

    public void sendKeysCharByChar(String jsonKey, String keys) {
        var by = getByValue(jsonKey);
        sendKeysCharByChar(by, keys);
    }

    public void sendKeysViaKeyboard(String jsonKey, String keys) {
        var by = getByValue(jsonKey);
        sendKeysWithKeyboard(by, keys);
    }

    public void sendKeysToElementInList(String text, int num, String jsonKey) {
        List<WebElement> elements = getElements(jsonKey);
        WebElement element = elements.get(num);
        element.sendKeys(text);
    }

    public void sendKeysWithKeyboard(By by, String keys) {
        new ActionsHelper().sendKeysWithBy(by, keys);
    }

    public void sendKeysWithScenarioStore(String jsonKey, String storeKey) {
        String storedValue = (String) ScenarioDataStore.get(storeKey);
        sendKeys(jsonKey, storedValue);
    }

    public void sendActions(String action,String jsonKey){
        var by = getByValue(jsonKey);
        WebElement element = DriverManager.getInstances().getDriver().findElement(by);

        switch (action) {
            case "ENTER":
                element.sendKeys(Keys.ENTER);
                break;
            case "CLEAR":
                element.sendKeys(Keys.CLEAR);
                break;
            case "TAB":
                element.sendKeys(Keys.TAB);
                break;
            case "COMMAND":
                element.sendKeys(Keys.COMMAND);
                break;
            case "ALT":
                element.sendKeys(Keys.ALT);
                break;
            case "BACK_SPACE":
                element.sendKeys(Keys.BACK_SPACE);
                break;
            case "CONTROL":
                element.sendKeys(Keys.CONTROL);
                break;
            case "DELETE":
                element.sendKeys(Keys.DELETE);
                break;
            case "SHIFT":
                element.sendKeys(Keys.SHIFT);
                break;
            case "RETURN":
                element.sendKeys(Keys.RETURN);
                break;
            case "SPACE":
                element.sendKeys(Keys.SPACE);
                break;

        }
    }

}