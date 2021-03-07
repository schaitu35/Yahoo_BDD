package Hooks;

import StepDefs.TestBase;
import io.cucumber.java.After;

public class AppHooks extends TestBase {

    @After
    public void teardown(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }
}
