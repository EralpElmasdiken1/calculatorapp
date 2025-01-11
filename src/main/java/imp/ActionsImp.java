package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.ActionsHelper;


public class ActionsImp extends ActionsHelper {


    @Step("Type <text> in the <element> field with keyboard")
    public void sendKeysWithActions(String text, String jsonKey) {
        sendKeysWithKey(jsonKey, text);
    }


    @Step("Click at <element> field with keyboard")
    public void clickWithActions(String jsonKey) {
        click(jsonKey);
    }


    @Step("Click at the offset x=<x>,y=<y>")
    public void clickWithActions(int x, int y) {
        clickPoint(x, y);
    }


    @Step("Clicked at the current mouse location.")
    public void clickWithActions() {
        click();
    }


    @Step("Clicked and hold  at the current mouse location.")
    public void clickAndHoldWithActions() {
        clickAndHold();
    }


    @Step("Click and hold at <element> field with keyboard")
    public void clickAndHoldWithActions(String jsonKey) {
        clickAndHold(jsonKey);
    }

    @Step("Release the depressed left mouse button, in the middle of the '<jsonKey>'")
    public void release(String jsonKey) {
        releaseMouse(jsonKey);
    }

    @Step("Release the depressed left mouse button")
    public void release() {
        releaseMouse();
    }

    @Step("Double clicked at the current mouse location.")
    public void doubleClickWithActions() {
        doubleClick();
    }

    @Step("Double click at <element> field with keyboard")
    public void doubleClickWithActions(String jsonKey) {
        doubleClick(jsonKey);
    }

    @Step("Move the mouse to the middle of the <element>")
    public void moveToElm(String jsonKey) {
        moveToElement(jsonKey);
    }

    @Step("Move the mouse from its current position  to x=<x>, y=<y> offset")
    public void moveByOffsetWithAction(int x, int y) {
        moveByOffset(x, y);
    }

    @Step("Move the mouse to an offset x= <int>,y= <int> from the <element>'s in-view center point")
    public void moveByOffsetWithAction(String jsonKey, int x, int y) {
        moveToElement(jsonKey, x, y);
    }

    @Step("Perform a context-click at middle of the <string>")
    public void rightClickWithAction(String jsonKey) {
        rightClick(jsonKey);
    }

    @Step("Perform a context-click at mouse current location")
    public void rightClickWithAction() {
        rightClick();
    }

    @Step("Click and hold at <element> and move to the location of the <element>")
    public void drugAndDropWithAction(String sourceElmJsonKey, String targetElmJsonKey) {
        dragAndDrop(sourceElmJsonKey, targetElmJsonKey);
    }

    @Step("Click and hold at <element> and moves by a offset x=<x>, y=<y>")
    public void drugAndDropWithAction(String sourceElmJsonKey, int x, int y) {
        dragAndDropBy(sourceElmJsonKey, x, y);
    }
}