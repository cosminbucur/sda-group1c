package com.sda.javafx.properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoSliderPropertyBinding extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = useSliderPropertyBinding();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox useSliderPropertyBinding() {
        Slider slider = new Slider();
        Label label = new Label("my label");
        VBox root = new VBox();

        // slider value affects the space between itself and the label
        // bind container.spacing with slider.value
        root.spacingProperty().bind(slider.valueProperty());
        root.getChildren().addAll(slider, label);

        return root;
    }
}
