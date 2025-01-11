package imp;

import com.thoughtworks.gauge.Step;
import helpers.methods.JavascriptHelper;


public class JavaScriptImp extends JavascriptHelper {

    @Step("Execute javascript <script> on browser")
    public void executeJavaScriptScript(String script) {
        executeJavascript(script);
    }
}