package inputoutput;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class IOController implements Initializable{

	@FXML private Button btn01;
	@FXML private TextField tf01, tf02;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn01.setOnAction(e -> {
			btnClickHandler(e);
		});
	}

	private void btnClickHandler(ActionEvent e) {
		tf02.setText(tf01.getText());
	}
}
