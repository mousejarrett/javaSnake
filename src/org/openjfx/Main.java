package org.openjfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage){
        controller.start(new Stage());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
