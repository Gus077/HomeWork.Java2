package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    private TextField sendText;


    public void btnSendClickAction(ActionEvent actionEvent) {
        textArea.appendText(sendText.getText()+"\n");
        sendText.clear();
        sendText.requestFocus();
    }
}
