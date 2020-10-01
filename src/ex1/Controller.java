package ex1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {


  @FXML public MenuItem close; // Переменая закрытия из меню итемс
  @FXML public Button clickBtn; // Создаем переменную действия
  @FXML public Label label;
  public Slider slider;

  public void clickClose(ActionEvent actionEvent) {
    Platform.runLater(() -> {
      Stage stage = (Stage) clickBtn.getScene().getWindow(); // Берем значение кнопки
      stage.close(); // если кнопка нажата закрыть
          });


  }

  public void changeSlider(MouseEvent mouseEvent) {
    label.setText(String.format("Slider : %f", slider.getValue()));
  }
}
