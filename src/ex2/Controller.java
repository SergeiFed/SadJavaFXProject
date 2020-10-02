package ex2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {


  @FXML
  public Button clickBtn1;
  @FXML
  public VBox vbox;


  public void clickAddButton(ActionEvent actionEvent) {
    int x = (int) (Math.random() * 100);
    Button button = new Button("Btn #" + x);
    vbox.getChildren().add(button);

    button.setOnAction(e -> {
      System.out.println(x);
    });
  }
}
