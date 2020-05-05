package view;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.transform.Translate;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    void initialize() {
        Translate translate = new Translate();
        translate.setX(60);
        translate.setY(60);
        translate.setZ(60);

    }
}
