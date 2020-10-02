package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;


    public void clickBtn1(ActionEvent actionEvent) {
        textArea.appendText("Hello\n");
    }

    public void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+"\n");
        textField.requestFocus();
    }
}
