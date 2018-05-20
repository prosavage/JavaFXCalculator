package application.grapher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GrapherScene {

    public GrapherScene() {
        try {
            Stage grapherStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("grapher.fxml"));
            Scene scene = new Scene(root, 600, 400);
            //scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
            grapherStage.setScene(scene);
            grapherStage.setTitle("Grapher");
            grapherStage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }




}
