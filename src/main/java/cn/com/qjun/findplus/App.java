package cn.com.qjun.findplus;

import cn.com.qjun.findplus.ui.model.HelloWorldViewModel;
import cn.com.qjun.findplus.ui.view.HelloWorldView;
import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 启动类
 *
 * @author RenQiang
 */
public class App extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World Application");

        final ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.javaView(HelloWorldView.class).load();

        final Parent root = viewTuple.getView();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
