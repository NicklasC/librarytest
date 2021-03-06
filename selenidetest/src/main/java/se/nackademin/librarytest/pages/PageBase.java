package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicklas
 */
public class PageBase {
    private  static final Logger LOG = Logger.getLogger(PageBase.class.getName()); 
    
    protected void clickButton(String descriptor,SelenideElement element){
        LOG.log(Level.INFO, "Clicking {0}", descriptor);
        element.click();
    }
    
    protected void setTextFieldValue(String descriptor,String value, SelenideElement element){
        LOG.info("Setting " + descriptor + " to " + value);
        element.clear();
        element.sendKeys(value);
    }
}
