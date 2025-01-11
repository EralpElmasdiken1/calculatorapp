package imp;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import helpers.methods.SelectHelper;
import utils.Utils;

public class SelectImp extends SelectHelper {

    @Step("Select by index = <index> in <selectElm> selector")
    public void selectByIndexImp(int i, String jsonKey) {
        selectByIndex(jsonKey, i);
    }

    @Step("Wait <second> presence of <selectElm> then select <index> of its option")
    public void selectByIndexImp(long timeout, String jsonKey, int i) {
        selectByIndex(jsonKey, i, timeout);
    }

    @Step("Wait <second> with poling every <millis> presence of <selectElm> then select <index> of its option")
    public void selectByIndexImp(long timeout, long millis, String jsonKey, int i) {
        selectByIndex(jsonKey, i, timeout, millis);
    }

    @Step("Select by value = <value> in <selectElm> selector")
    public void selectByValueImp(String value, String jsonKey) {
        selectByValue(jsonKey, value);
    }

    @Step("Wait <second> presence of <selectElm> then select <value> of its option")
    public void selectByValueImp(long timeout, String jsonKey, String value) {
        selectByValue(jsonKey, value, timeout);
    }

    @Step("Wait <second> with poling every <millis> presence of <selectElm> then select <value> of its option")
    public void selectByValueImp(long timeout, long millis, String jsonKey, String value) {
        selectByValue(jsonKey, value, timeout, millis);

    }

    @Step("Select by visible text = <visibleText> in <selectElm> selector")
    public void selectByVisibleTextImp(String value, String jsonKey) {
        selectByVisibleText(jsonKey, value);
    }

    @Step("Select by visible text = <value> of <num>. element in <jsonKey> selector")
    public void selectByVisibleTextFromListElementImp(String value, int num ,String jsonKey) {
        selectByVisibleTextFromListElement(value, num, jsonKey);
    }

    @Step("Wait <second> presence of <selectElm> then select <visibleText> of its option")
    public void selectByVisibleTextImp(long timeout, String jsonKey, String value) {
        selectByVisibleText(jsonKey, value, timeout);
    }

    @Step("Wait <second> with poling every <millis> presence of <selectElm> then select <visibleText> of its option")
    public void selectByVisibleTextImp(long timeout, long millis, String jsonKey, String value) {
        selectByValue(jsonKey, value, timeout, millis);
    }


    @Step("Multiple select below indexes of <selectElm> option <table>")
    public void multipleSelectByIndexImp(String jsonKey, Table table) {
        var indexes = new Utils().gaugeDataTableToIntArray(table);
        multipleSelectByIndexes(jsonKey, indexes);
    }

    @Step("Multiple select below visible texes of <selectElm> option <table>")
    public void multipleSelectByVisableTexesImp(String jsonKey, Table table) {
        var visibleTexes = new Utils().gaugeDataTableToStringArray(table);
        multipleSelectByVisibleText(jsonKey, visibleTexes);
    }




}