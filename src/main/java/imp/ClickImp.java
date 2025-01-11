package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.ClickHelper;
import helpers.methods.ClickableHelper;


public class ClickImp extends ClickHelper {


    @Step("Click on <string>")
    public void clickImp(String jsonKey) {
        clickElement(jsonKey);
    }

    @Step("Click on <string> without wait")
    public void clickWithOutWaitImp(String jsonKey) {
        clickElementWithoutWait(jsonKey);
    }

    @Step("Wait for <int> second presence of <element> then click")
    public void clickImp(String jsonKey, long timeout) {
        clickElement(jsonKey, timeout);
    }

    @Step("Wait for <long> second with sleep in <long> millis presence of <string> then click")
    public void clickImp(String jsonKey, long timeout, long sleepInMillis) {
        clickElement(jsonKey, timeout, sleepInMillis);
    }

    @Step("Click if exists if so click on <element>")
    public void clickIfExistsImp(String jsonKey) {
        checkIfExitsClick(jsonKey);
    }

    @Step("Click if exists on <element>if not click <string>")
    public void ifExistsClickXIfNotClickYImp(String xJsonKey, String yJsonKey) {
        ifExistsClickXIfNotClickY(xJsonKey, yJsonKey);
    }


    @Step("Wait for <long> second presence of <string> then click, if not exists click <string>")
    public void ifExistsClickXIfNotClickYImp(long timeout, String xJsonKey, String yJsonKey) {
        ifExistsClickXIfNotClickY(xJsonKey, yJsonKey, timeout);
    }

    @Step("Click at <string> with javaScript")
    public void clickWithJavaScriptImp(String jsonKey) {
        clickWithJavaScript(jsonKey);
    }

    @Step("Click on <string> <int> times")
    public void clickMultipleTimesImp(String jsonKey, int times) {
        clickElementMultipleTimes(jsonKey, times);
    }

}