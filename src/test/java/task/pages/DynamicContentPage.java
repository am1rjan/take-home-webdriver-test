package task.pages;

import org.openqa.selenium.support.PageFactory;
import task.utilities.Driver;

public class DynamicContentPage {

    public DynamicContentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
