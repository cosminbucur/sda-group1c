package com.sda.javafx.containers;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoGridPane extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = buildGridPane();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane buildGridPane() {
        GridPane root = new GridPane();

        // add 4 elements to grid
        root.add(new Label("Element 1, 1"), 0, 0);
        root.add(new TextField("Element 1, 2"), 1, 0);
        root.add(new Label("Element 2, 1"), 0, 1);
        root.add(new TextField("Element 2, 2"), 1, 1);

        return root;
    }
}
