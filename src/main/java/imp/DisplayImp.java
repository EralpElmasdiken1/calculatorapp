package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.DisplayHelper;

public class DisplayImp extends DisplayHelper {

    @Step("<text> element is Displayed")
    public void isDisplayedImp(String text){
        isDiplayed(text);
    }

    @Step("Is Not Display the <element> element")
    public void elementNotDisplayedImp(String element) {
        elementNotDisplayed(element);

    }


}
