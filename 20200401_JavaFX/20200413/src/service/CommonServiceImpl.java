package service;

import java.io.IOException;

import application.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{
	@Override
	public void WindowClose(ActionEvent e) {
		Parent root = (Parent) e.getSource();
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
	}

	@Override
	public void WindowShow(Stage stage, String URL) {

		FXMLLoader loader = new FXMLLoader(getClass().getResource(URL));
		Parent root = null;
		try {
			root = loader.load();
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}

		LoginController ctrler = loader.getController();
		ctrler.setRoot(root);

		stage.show();
	}

}
