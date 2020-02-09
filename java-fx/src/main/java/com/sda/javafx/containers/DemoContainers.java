package com.sda.javafx.containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoContainers extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // create container
        VBox vBox = new VBox();

        // create label
        Label label = new Label("hello");

        // set label to vbox
        // container
        // label
        vBox.getChildren().add(label);

        // create scene
        Scene scene = new Scene(vBox);

        // set scene
        stage.setScene(scene);

        // display window
        stage.show();
    }
}
