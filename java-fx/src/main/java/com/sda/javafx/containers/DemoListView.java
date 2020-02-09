package com.sda.javafx.containers;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoListView extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildListView();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox buildListView() {
        ListView<String> listView = new ListView<>();

        ObservableList<String> items = listView.getItems();
        items.addAll("element 1", "element 2", "element 3");

        VBox root = new VBox();
        root.getChildren().add(listView);

        root.setSpacing(20);

        return root;
    }
}
