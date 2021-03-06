package com.whinc.view;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by whinc on 2015/8/18.
 * E-mail: xiaohui_hubei@163.com
 */
public class MainWindow extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/fxml/MainWindow.fxml");
        Parent root = FXMLLoader.<Parent>load(resource);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Translator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(MainWindow.class, args);
    }
}
