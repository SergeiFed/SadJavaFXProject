package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Controller {

    @FXML private TextArea taChat;
    @FXML private TextField tfMessage;


    public void sendButtonAction(ActionEvent actionEvent) {
        taChat.appendText("Me: " + tfMessage.getText()+"\n");
        tfMessage.requestFocus();
        tfMessage.clear();
        taChat.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.ENTER){
                taChat.appendText("Me: " + tfMessage.getText()+"\n");
                tfMessage.requestFocus();
                tfMessage.clear();
            }
        });
    }

    }



