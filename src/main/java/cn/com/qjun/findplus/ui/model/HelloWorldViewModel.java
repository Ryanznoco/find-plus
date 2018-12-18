package cn.com.qjun.findplus.ui.model;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author RenQiang
 * @date 2018/12/18
 */
public class HelloWorldViewModel implements ViewModel {

    private final StringProperty helloMessage = new SimpleStringProperty("Hello World");

    public StringProperty helloMessage() {
        return helloMessage;
    }

    public String getHelloMessage() {
        return helloMessage.get();
    }

    public void setHelloMessage(String message) {
        helloMessage.set(message);
    }

}
