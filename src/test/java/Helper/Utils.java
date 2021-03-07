package Helper;

import AppEnums.LocatorType;
import org.openqa.selenium.By;

public class Utils {

    private static By getBY(LocatorType type, String locator){
        By by = null;
        switch (type){
            case ID:
                by = By.id(locator);
                break;
            case CSS:
                by = By.cssSelector(locator);
                break;
            case NAME:
                by = By.name(locator);
                break;
            case XPATH:
                by = By.xpath(locator);
                break;
            case TAG_NAME:
                by = By.tagName(locator);
                break;
            case LINK_TEXT:
                by = By.linkText(locator);
                break;
            case CLASS_NAME:
                by = By.className(locator);
                break;
            case PARTIAL_LINK_TEXT:
                by = By.partialLinkText(locator);
                break;
            default:
                throw new NullPointerException();
        }
        return by;
    }




}
