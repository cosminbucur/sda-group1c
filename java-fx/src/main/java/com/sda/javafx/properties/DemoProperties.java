package com.sda.javafx.properties;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoProperties extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildVBoxWithProperties();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox buildVBoxWithProperties() {
        VBox root = new VBox();

        // set text property on text field
        TextField textField = new TextField("initial value");
        textField.setText("new value");

        StringProperty textProperty = textField.textProperty();

        root.getChildren().addAll(textField);

        return root;
    }

}
