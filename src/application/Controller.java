package application;

import application.grapher.GrapherScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private Label result;
    private long num1 = 0;
    private String operator = "";
    private boolean start = true;






    @FXML
    public void launchGrapher() {
        GrapherScene grapherScene = new GrapherScene();
    }

    @FXML
    public void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }

        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);
    }


    public void processNumbers(int number) {
        if (start) {
            result.setText("");
            start = false;
        }

        String value = number + "";
        result.setText(result.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        System.out.println("Found operator: " + value);


        if (!value.equals("=")) {

            System.out.println("Operator was not an =");

            if (!operator.isEmpty()) { return; }
            operator = value;
            num1 = Long.parseLong(result.getText());
            System.out.println("Stored num1: " + num1);
            result.setText("");
        }

        if (value.equals("=")) {


            System.out.println("Operator was an =");

            if (operator.isEmpty()) {
                System.out.println("empty operator..");
                return;
            }
            long num2 = Long.parseLong(result.getText());
            System.out.println("Stored num2: " + num2);
            float output = Modal.Calculate(num1,num2,operator);
            System.out.println("Output: " + output);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }






    }
    public void processOperators(String operand) {
        String value =  operand;

        System.out.println("Found operator: " + value);


        if (!value.equals("=")) {

            System.out.println("Operator was not an =");

            if (!operator.isEmpty()) { return; }
            operator = value;
            num1 = Long.parseLong(result.getText());
            System.out.println("Stored num1: " + num1);
            result.setText("");
        }

        if (value.equals("=")) {


            System.out.println("Operator was an =");

            if (operator.isEmpty()) {
                System.out.println("empty operator..");
                return;
            }
            long num2 = Long.parseLong(result.getText());
            System.out.println("Stored num2: " + num2);
            float output = Modal.Calculate(num1,num2,operator);
            System.out.println("Output: " + output);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }





    }




}
