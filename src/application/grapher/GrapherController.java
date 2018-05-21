package application.grapher;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;


public class GrapherController {

    @FXML
    private HBox canvasBox;


    public void test() {
        Canvas canvas = new Canvas(570,250);
        canvasBox.getChildren().add(canvas);
        double startX = canvas.getWidth()/2 * -1;
        double endX = startX * -1;
        double startY = canvas.getHeight()/2 * -1;
        double endY = startY * -1;

        GraphicsContext grapher = canvas.getGraphicsContext2D();
        grapher.beginPath();

        String equation = "x+1";
        grapher.moveTo(startX,Evaluator.eval(equation.replace("x",startX + "")));
        for (double i = startX; i < endX; i++) {
            grapher.lineTo(startX,Evaluator.eval(equation.replace("x",String.valueOf(i))));
        }






    }



}
