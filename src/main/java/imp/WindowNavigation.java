package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.WindowNavigationHelper;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WindowNavigation extends WindowNavigationHelper {
    private final Logger log = LogManager.getLogger(WindowNavigation.class);

    @Step("Click to go forward")
    public void forward() {windowForward();
        log.info("Go forward clicked");
    }

    @Step("Click to go back")
    public void back() {windowBack();
        log.info("Go back clicked");
    }

    @Step("Click refresh")
    public void refresh() {windowRefresh();
        log.info("Go back refresh");
    }
}