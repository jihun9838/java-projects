package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HboxVboxQuiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		int prefWidth = 200;
		int prefHeight = 200;
		int trbl = 50;
		Button b1 = new Button();
		b1.setPrefSize(prefWidth, prefHeight);
		//b1.setPadding(new Insets(trbl));
		
		Button b2 = new Button();
		b2.setPrefSize(prefWidth, prefHeight);
		//b2.setPadding(new Insets(trbl));
		
		VBox vb = new VBox(b1, b2);
		//vb.setPadding(new Insets(trbl));
		vb.setSpacing(trbl);
		
		Button b3 = new Button();
		b3.setPrefSize(prefWidth, prefHeight * 2 + trbl);
		b3.setText("DO NOT CLICK THIS BUTTON");

		//b3.setPadding(new Insets(trbl));
		b3.setOnAction(e->{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("HAHA");
			alert.setContentText("HEHEHEHEHEHEHEHE");
			alert.setHeaderText("THIS IS NOT A JOKE");
			alert.show();
		});
		
		
		HBox hb = new HBox(vb, b3);
		hb.setSpacing(trbl);
		hb.setPadding(new Insets(trbl));
		
		Scene scene = new Scene(hb);
		primaryStage.setScene(scene);
		primaryStage.setTitle("asdf");
		primaryStage.show();
		
	}
}
