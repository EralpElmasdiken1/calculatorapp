package imp;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import helpers.methods.GetAttributeHelper;


public class GetAttributeImp extends GetAttributeHelper {

    @Step("Get text of <element> and store it in scenario store with <key> and default wait")
    public void getTextOfElmWithWait(String jsonKey, String key) {
        ScenarioDataStore.put(key, getTexWithWait(jsonKey));
    }

    @Step("Get text of <element> and store it in scenario store with <key>")
    public void getTextOfElmWithoutWait(String jsonKey, String key) {
        ScenarioDataStore.put(key, getTexWithoutWait(jsonKey));
    }

    @Step("Wait <second> presence of <element> then get text and store it in scenario store with <key>")
    public void getTextOfElmWithWait(long timeout, String jsonKey, String key) {
        ScenarioDataStore.put(key, getTexWithWait(jsonKey, timeout));
    }

    @Step("Wait <second> and poling ever <millis> millis  presence of <element> then get text and store it in scenario store with <key>")
    public void getTextOfElmWithWait(long timeout, long polingWait, String jsonKey, String key) {
        ScenarioDataStore.put(key, getTexWithWait(jsonKey, polingWait, timeout));
    }

    @Step("Get <attribute> of <element> and store it in scenario store with <key> and default wait")
    public void getAttributeOfElmWithWait(String attribute, String jsonKey, String key) {
        ScenarioDataStore.put(key, getAttributeWithDefaultWait(jsonKey, attribute));
    }

    @Step("Get <attribute> of <element> and store it in scenario store with <key> without any wait")
    public void getAttributeOfElmWithoutWait(String attribute, String jsonKey, String key) {
        ScenarioDataStore.put(key, getAttributeWithoutWait(jsonKey, attribute));
    }

    @Step("Get size of <element> and store it scenario store with <key>")
    public void getSizeOfElement(String jsonKey, String key) {
        ScenarioDataStore.put(key, getElementSize(jsonKey));
    }

    @Step("Get inner text of <element> and store it in scenario store with <key> and default wait")
    public void getInnerTextOfElmWithWait(String jsonKey, String key) {
        ScenarioDataStore.put(key, getInnerTextOfElement(jsonKey));
    }
}