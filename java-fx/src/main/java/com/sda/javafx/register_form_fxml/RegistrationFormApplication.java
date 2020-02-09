package com.sda.javafx.register_form_fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegistrationFormApplication extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = buildSceneFromXml();
        stage.setScene(scene);
        stage.show();
    }

    private Scene buildSceneFromXml() throws IOException {
        // get fxml file URL
        URL fxml = getClass().getClassLoader().getResource("registration_form.fxml");

        // load fxml file
        Parent root = FXMLLoader.load(fxml);

        // create scene
        Scene scene = new Scene(root);
        return scene;
    }
}
