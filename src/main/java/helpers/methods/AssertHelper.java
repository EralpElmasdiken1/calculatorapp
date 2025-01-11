package helpers.methods;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AssertHelper extends VisibleHelper{

    private final Logger log = LogManager.getLogger(PresenceHelper.class);

    private GetElementHelper getElementHelper;

    public AssertHelper(){
        getElementHelper = new GetElementHelper();
    }

    public void assertText(String assertText, String json){
        waitVisibleOfElement(json);
        var by = getElementHelper.getElementWithoutWait(json);
        var text=  by.getText();
        Assertions.assertEquals(assertText,text);
        log.info("{} text assert equals {} json parameter", assertText, json);
    }

    public void assertTextFromList(String assertText, String json, int listNum){
        waitVisibleOfElement(json);
        List<WebElement> elements = getElementHelper.getElementsWithWait(json);
        String text = elements.get(listNum).getText();
        Assertions.assertEquals(assertText,text);
        log.info("{} text assert equals {} json parameter", assertText, json);
    }

    public void assertNotTextFromList(String assertText, String json, int listNum){
        waitVisibleOfElement(json);
        List<WebElement> elements = getElementHelper.getElementsWithWait(json);
        String text = elements.get(listNum).getText();
        Assertions.assertNotEquals(assertText,text);
        log.info("{} text assert equals {} json parameter", assertText, json);
    }

    public void assertURL(String URLtoCheck){

        String currentUrl = DriverManager.getInstances().getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, URLtoCheck);
    }

    public void assertTextWithScenarioStore(String jsonKey, String storeKey) {
        String storedValue = (String) ScenarioDataStore.get(storeKey);

        assertText(storedValue, jsonKey);
    }

    public void assertElementValue(String jsonKey, String expectedValue) {
        waitVisibleOfElement(jsonKey);
        var element = getElementHelper.getElementWithoutWait(jsonKey);
        String actualValue = element.getAttribute("value");
        Assertions.assertEquals(expectedValue, actualValue,
                String.format("Expected value '%s' but found '%s' in element '%s'", expectedValue, actualValue, jsonKey));
        log.info("Element value '{}' matches the expected value '{}'", actualValue, expectedValue);
    }



}
