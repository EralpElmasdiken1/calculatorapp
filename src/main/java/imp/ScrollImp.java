package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.ScrollHelper;


public class ScrollImp extends ScrollHelper {

    @Step("Scroll to top of the page")
    public void scrollTopOfThePage() {
        pageUp();
    }

    @Step("Scroll to bottom of the page")
    public void scrollBottomOfThePage() {
        pageDown();
    }

    @Step("Scroll to <element>")
    public void scrollBottomOfThePage(String jsonKey) {
        scrollToElement(jsonKey);
    }

    @Step("Scroll to coordinate x= <x>, y= <y>")
    public void scrollBottomOfThePage(int x, int y) {
        scrollToPoint(x, y);
    }
}