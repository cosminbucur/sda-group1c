package com.sda.javafx.properties;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoPropertyChangeListener extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        usePropertyChangeListener();
    }

    private void usePropertyChangeListener() {
        // create a string property
        SimpleStringProperty stringProperty = new SimpleStringProperty("start value");

        // print
        System.out.println("1 initial: " + stringProperty.getValue());

        // add a listener - action that will run if the property changes
        stringProperty.addListener((observable, oldValue, newValue) -> {
            System.out.println("old value: " + oldValue);
            System.out.println("2. new value is set: " + newValue);
        });

        // set new value
        stringProperty.setValue("some new value");
    }

}
