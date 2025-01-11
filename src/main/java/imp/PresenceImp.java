package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.PresenceHelper;

public class PresenceImp extends PresenceHelper {
    @Step("Presence on <string>")
    public void presenceWaitImp(String jsonKey) {
        presenceWait(jsonKey);
    }

    @Step("Check if <element> element is present")
    public boolean isElementPresent(String jsonKey) {
        return isPresence(jsonKey, 5);
    }

}
