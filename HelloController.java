import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label lbl1;
    @FXML
    private TextField txt1;

    public void button1Pushed() {
        System.out.println("Hello World!");
        lbl1.setText(txt1.getText());
    }
}