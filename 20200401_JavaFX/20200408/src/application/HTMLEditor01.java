package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditor01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();

		HTMLEditor ta = new HTMLEditor();
		ta.setPrefSize(200, 150);
		ta.setLayoutX(20);
		ta.setLayoutY(20);

		ap.getChildren().add(ta);
		ap.setPrefSize(300, 200);

		primaryStage.setScene(new Scene(ap,700, 700));
		primaryStage.show();

	}

}
