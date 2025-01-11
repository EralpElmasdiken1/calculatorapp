package base;

import com.thoughtworks.gauge.*;
import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import utils.ReuseStoreData;



public class BaseBrowser {
    private final Logger log = LogManager.getLogger(BaseBrowser.class);


    public void setUp() {
        DriverManager.getInstances().createLocalDriver();
        log.info("{} launched",DriverManager.getInstances().getBrowsersType());
    }

    @AfterScenario
    public void tearDown() {
//        DriverManager.getInstances().quitDriver();
        ReuseStoreData.remove();
    }

    @BeforeSpec
    public void setFileNameForGauge(ExecutionContext context) {
        var fileName = context.getCurrentSpecification().getFileName();
        setFileName(fileName);
    }
    private void setFileName(String fileName) {
        int firstIndex = fileName.lastIndexOf('/');
        int lastIndex = fileName.lastIndexOf('.');
        GetFileName.getInstance().setFileName(fileName.substring(firstIndex + 1, lastIndex));
    }

    @AfterStep
    public void takeScreenShot() {
        var take_screens = Boolean.parseBoolean(System.getenv("screenshot_after_each_step"));
        if (take_screens)
            Gauge.captureScreenshot();
    }
}
