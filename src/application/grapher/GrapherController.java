package application.grapher;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;


public class GrapherController {

    @FXML
    private Canvas canvas;


    public void test() {
        double startX = canvas.getWidth()/2 * -1;
        double endX = startX * -1;
        double startY = canvas.getHeight()/2 * -1;
        double endY = startY * -1;
        //canvas.getGraphicsContext2D().
        //canvas.getGraphicsContext2D().beginPath();
    }



}
