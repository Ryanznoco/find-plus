package cn.com.qjun.findplus.ui.view;

import cn.com.qjun.findplus.ui.model.HelloWorldViewModel;
import com.jfoenix.controls.JFXButton;
import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import io.reactivex.rxjavafx.observables.JavaFxObservable;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author RenQiang
 * @date 2018/12/18
 */
public class HelloWorldView extends VBox implements JavaView<HelloWorldViewModel>, Initializable {

    private final Label helloLabel = new Label();

    @InjectViewModel
    private HelloWorldViewModel viewModel;

    public HelloWorldView() {
        getChildren().add(helloLabel);
        JFXButton firstButton = new JFXButton("Press Me");
        JFXButton secondButton = new JFXButton("Press Me Too");
        Observable.merge(
                JavaFxObservable.actionEventsOf(firstButton),
                JavaFxObservable.actionEventsOf(secondButton)
        ).subscribe(i -> System.out.println("You pressed one of the buttons!"));
        getChildren().add(firstButton);
        getChildren().add(secondButton);
        setPadding(new Insets(10, 10, 10, 10));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        helloLabel.textProperty().bind(viewModel.helloMessage());
    }
}