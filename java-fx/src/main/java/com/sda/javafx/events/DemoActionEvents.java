package com.sda.javafx.events;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoActionEvents extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildVBoxWithActionEvent();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox buildVBoxWithActionEvent() {
        Button button = new Button("press me");
        // EventHandler.handle
        button.setOnAction(event -> {
            System.out.println("click!");
            System.out.println(event.getSource());
        });

        VBox root = new VBox();
        root.getChildren().add(button);

        root.setSpacing(20);

        return root;
    }
}
