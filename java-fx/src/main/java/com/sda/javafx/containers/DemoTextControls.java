package com.sda.javafx.containers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoTextControls extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = buildTextControls();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox buildTextControls() {
        VBox root = new VBox();

        Button button = new Button("save");
        System.out.println(button.getText());

        TextField textField = new TextField("text field");
        System.out.println(textField.getText());

        TextArea textArea = new TextArea("text area");
        System.out.println(textArea.getText());

        Label label = new Label("label");
        System.out.println(label.getText());

        CheckBox checkBox = new CheckBox("tick me");
        System.out.println(checkBox.getText());

        // add controls to container
        root.getChildren().addAll(button, textArea, textField, label, checkBox);

        root.setSpacing(20);

        return root;
    }
}
