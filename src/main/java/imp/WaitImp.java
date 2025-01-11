package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.WaitHelper;

public class WaitImp extends WaitHelper {

    @Step("Wait <ms> ms")
    public void waitForMiliSeconds(int ms){
        waitSomeTime(ms);
    }
}
