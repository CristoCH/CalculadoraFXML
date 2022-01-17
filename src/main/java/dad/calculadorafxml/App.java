package dad.calculadorafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    private Controller controller;
    @Override
    public void start(Stage stage) throws Exception {
        controller = new Controller();

        Scene scene = new Scene(controller.getView());
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.getIcons().add(new Image("calculator-32x32.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
