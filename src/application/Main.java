package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    private Controller controller = new Controller();


    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Scene scene = new Scene(root, 300, 275);
            scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("My First JavaFX Calculator");
            primaryStage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
