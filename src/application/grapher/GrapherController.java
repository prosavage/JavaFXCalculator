package application.grapher;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class GrapherController {

    @FXML
    private Canvas canvas;
    @FXML
    private TextField equation;

    public void graph() {

        if (equation.getCharacters().toString().isEmpty()) {
            return;
        } else {
            drawGraph(equation.getCharacters().toString());
        }
    }



    public void drawGraph(String equation) {
       // canvasBox.getChildren().clear();
        //Canvas canvas = new Canvas(570,250);
        //canvasBox.getChildren().add(canvas);
        double startX = canvas.getWidth()/2 * -1;
        double endX = startX * -1;
        double startY = canvas.getHeight()/2 * -1;
        double endY = startY * -1;

        GraphicsContext grapher = canvas.getGraphicsContext2D();
        grapher.beginPath();

        grapher.setLineWidth(1.0);
        grapher.setFill(Color.GREEN);
        grapher.setStroke(Color.GREEN);


        double originX = canvas.getWidth()/2;
        double originY = canvas.getHeight()/2;
        //grapher.moveTo(startX,Evaluator.eval(equation.replace("x",startX + "")) + endY);



        //draw guide lines
        for (int i = 0; i < canvas.getWidth(); i ++) {
            grapher.fillOval(i,originY,1,1);

        }
        for (int i = 0; i < canvas.getHeight(); i ++) {
            grapher.fillOval(originX,i,1,1);
        }


        boolean first = true;

        for (double i = startX; i < endX; i++) {
            if (first) {
                grapher.fillOval(originX + i * -1,Evaluator.eval(equation.replace("x",String.valueOf(i))) + originY,1,1);
                first = false;
            }
            grapher.lineTo(originX + i * -1,Evaluator.eval(equation.replace("x",String.valueOf(i))) + originY);
            grapher.stroke();
            //grapher.fillOval(originX + i * -1,Evaluator.eval(equation.replace("x",String.valueOf(i))) + originY,1,1);
        }

        //grapher.fillRect(0,0,50,50);






    }

    public void clear() {
        canvas.getGraphicsContext2D().clearRect(0,0,canvas.getWidth(),canvas.getHeight());
    }



}
