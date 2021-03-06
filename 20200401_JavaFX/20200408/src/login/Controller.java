package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable{

	@FXML private Button btn;
	@FXML private TextField tf;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tf.setOnKeyPressed(e ->{
			handleTfAction(e);
		});
		btn.setOnAction(e -> {
			handleBtnAction(e);
		});

		//		btn.setOnAction(new EventHandler<ActionEvent> event{
		//			handleBtnAction(event)
		//		});
	}

	private void handleTfAction(KeyEvent e) {
		if(e.getCode() == KeyCode.ENTER) {
			System.out.println(tf.getText());
		}
	}

	public void handleBtnAction(ActionEvent event) {
		System.out.println(tf.getText());
		//tf.requestFocus();
	}

}
