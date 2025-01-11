package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.AssertHelper;

public class AssertImp extends AssertHelper {

    @Step("The text of the <locatorValue> element assert <text>")
    public void assertTextImp(String locatorValue, String text){
        assertText(text,locatorValue);

    }

    @Step("The <listNum>. text of the <locatorValue> element assert <text>")
    public void assertTextFromListImp(int listNum,String locatorValue, String text){
        assertTextFromList(text,locatorValue,listNum);

    }

    @Step("The <listNum>. text of the <locatorValue> element assert not equals to <text>")
    public void assertNotTextFromListImp(int listNum,String locatorValue, String text){
        assertNotTextFromList(text,locatorValue,listNum);

    }
    @Step("Assert current URL with <URL>")
    public void assertURLImp(String URL){
        assertURL(URL);

    }

    @Step("The text of the <element> element assert with scenario store <key>")
    public void assertTextWithScenarioStoreStep(String jsonKey, String storeKey) {
        assertTextWithScenarioStore(jsonKey, storeKey);
    }

    @Step("Assert the value of element <locatorValue> is <expectedValue>")
    public void assertElementValueImp(String locatorValue, String expectedValue) {
        assertElementValue(locatorValue, expectedValue);
    }


}
