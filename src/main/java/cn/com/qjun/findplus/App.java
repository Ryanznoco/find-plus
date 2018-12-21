package cn.com.qjun.findplus;

import cn.com.qjun.findplus.ui.model.RootViewModel;
import cn.com.qjun.findplus.ui.view.RootView;
import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        primaryStage.getIcons().add(new Image(App.class.getResourceAsStream("/icons/icon_64x64.png")));
        primaryStage.setTitle("Find Plus");

        final ViewTuple<RootView, RootViewModel> viewTuple = FluentViewLoader.javaView(RootView.class).load();

        final Parent root = viewTuple.getView();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
