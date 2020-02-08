package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    public TextField txtSend;
    @FXML
    public TextArea outputMsg;
    @FXML
    public Button btnSend;

    public void sendMsg() {
        if (!txtSend.getText().trim().equals("")) {
            Node lText = outputMsg.lookup(".text");
            lText.setStyle("-fx-text-alignment: right;");
            outputMsg.appendText(txtSend.getText() + "\n");
            txtSend.clear();
            txtSend.setFocusTraversable(false);
        } else {
            System.out.println("textField is empty");
        }
    }

    @FXML
    private void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sendMsg();
        }
    }

}
