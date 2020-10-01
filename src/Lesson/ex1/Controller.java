package Lesson.ex1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    @FXML public Button btn1;
    @FXML public Label label;
    @FXML public Slider slider;

    public void clickCloseBtn(ActionEvent actionEvent) {
        Platform.runLater(()->{
            Stage stage = (Stage) btn1.getScene().getWindow();
            stage.close();
        });
    }

    public void changeSlider(MouseEvent mouseEvent) {
        label.setText(String.format("Slider : %.01f", slider.getValue()));
    }
}
