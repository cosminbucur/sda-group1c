package com.sda.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class DemoLifecycle extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init app");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("starting app...");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stopping app");
    }
}
