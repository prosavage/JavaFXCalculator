package application.grapher;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GrapherScene {

    public GrapherScene() {
        try {
            Stage grapherStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResourceAsStream("grapher.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("grapher.css").toExternalForm());
            grapherStage.setScene(scene);
            grapherStage.setTitle("Grapher");
            grapherStage.show();
            GrapherController controller = (GrapherController) loader.getController();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }





}
