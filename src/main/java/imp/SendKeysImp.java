package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.SendKeysHelper;

public class SendKeysImp extends SendKeysHelper {

    @Step("Type <text> into <element> element")
    public void sendKeysImp(String text, String jsonKey) {
        sendKeys(jsonKey, text);
    }

    @Step("Wait for <second> second presence of <element> and type <text> into  it")
    public void sendKeysImp(long sec, String jsonKey, String text) {
        sendKeys(jsonKey, text, sec);
    }

    @Step("Wait for <second> second presence of <element> with <millis> pooling and type <text> into  it")
    public void sendKeysImp(long timeout, long poolingWait, String jsonKey, String text) {
        sendKeys(jsonKey, text, timeout, poolingWait);
    }

    @Step("Type <text> char by char into <element> element")
    public void sendKeysCharByCharImp(String jsonKey, String text) {
        sendKeysCharByChar(jsonKey, text);
    }

    @Step("Type <text> into <element> element with keyboard")
    public void sendKeysWithKeyboardImp(String text, String jsonKey) {
        sendKeysViaKeyboard(jsonKey, text);
    }

    @Step("Type <text> into <num>. element with <jsonKey> key")
    public void sendKeysWithKeyboardImp(String text, int num, String jsonKey) {
        sendKeysToElementInList(text, num, jsonKey);
    }



    @Step("Send <action> action to element with key <jsonKey>")
    public void sendActionsImp(String action,String jsonKey) {
        sendActions(action,jsonKey);
    }

    @Step("Type value from scenario store with <key> into <element> element")
    public void sendKeysWithScenarioStoreStep(String storeKey, String jsonKey) {
        sendKeysWithScenarioStore(jsonKey, storeKey);
    }

}