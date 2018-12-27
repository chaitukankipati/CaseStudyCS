package org.support.pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import org.support.browser.Browser;


public class LoginPage extends Browser{

    @FindBy(name = "username")
    public static TextInput email;

    @FindBy(id = "inputPassword")
    public static TextInput password;

    @FindBy(id = "login")
    public static Button login;

    public void submit(){
        login.click();
    }

}
