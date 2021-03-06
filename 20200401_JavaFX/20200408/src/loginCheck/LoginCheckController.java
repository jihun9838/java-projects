package loginCheck;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginCheckController extends MyDB implements Initializable{

	private MyDB db;
	@FXML private Button btn01;
	@FXML private TextField tf01, tf02;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		db = new MyDB();
		db.addIdnPwd("asdf1", "asdf11");
		db.addIdnPwd("asdf2", "asdf22");
		db.addIdnPwd("asdf3", "asdf33");
		db.addIdnPwd("asdf4", "asdf44");
		db.addIdnPwd("asdf5", "asdf55");

		btn01.setOnAction(e -> {
			btnActionHandler(e);

		});

		//		btn.setOnKeyPressed(e ->{
		//			handleTfAction(e);
		//		});

	}

	private void btnActionHandler(ActionEvent e) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("LOGIN ERROR");

		HashMap<String, String> idnPwd = db.getIdnPwd();
		String checkId = tf01.getText().toString();
		String checkPwd = tf02.getText().toString();

		System.out.println(idnPwd.size());

		if(checkId.isEmpty()) {
			alert.setHeaderText("ID ERROR");
			alert.setContentText("Please Enter Your ID First.");
		}
		else {
			if(checkPwd.isEmpty()) {
				alert.setHeaderText("PWD ERROR");
				alert.setContentText("Please Enter Your PWD First.");
			}
			else {
				if(idnPwd.containsKey(checkId) == false) {
					alert.setHeaderText("ID ERROR");
					alert.setContentText("ID Matching Error.");
				}
				else {
					if(idnPwd.get(checkId).equals(checkPwd)){
						alert.setTitle("LOGIN SUCCESS");
						alert.setHeaderText("LOGIN SUCCESS");
						alert.setContentText("LOGIN SUCCESS");
					}
					else{
						alert.setHeaderText("PWD ERROR");
						alert.setContentText("PWD Mathcing Error.");
						tf01.setText("");
						tf02.setText("");
					}
				}
			}
		}

		alert.show();
	}

	//	private void handleTfAction(KeyEvent e) {
	//		if(e.getCode() == KeyCode.ENTER) {
	//			btn.setOnAction(eh -> {
	//				btnActionHandler(eh);
	//			});
	//		}
	//	}

}
