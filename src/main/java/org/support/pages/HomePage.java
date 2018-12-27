package org.support.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.support.browser.Browser;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class HomePage extends Browser {

    @FindBy(xpath = "//div[text()='Services']")
    public HtmlElement welcomeServiceLabel;

}
