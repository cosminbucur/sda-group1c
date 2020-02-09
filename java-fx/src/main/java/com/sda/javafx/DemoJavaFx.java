package com.sda.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoJavaFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // set stage (window) properties
        primaryStage.setTitle("JavaFx Application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);

        // create container
        VBox vBox = new VBox();
        Label label = new Label("Hello world!");
        vBox.getChildren().add(label);

        // create scene
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
