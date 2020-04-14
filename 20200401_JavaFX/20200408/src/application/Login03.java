package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login03 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		TextField tf = new TextField("alkghaelfkghsdlifuhlkuWLRUSHDFADS");
		Button btn = new Button("OK");

		btn.setPrefSize(100, 30);
		btn.setOnAction(e -> System.out.println(tf.getText()));

		hb.getChildren().addAll(tf, btn);

		primaryStage.setScene(new Scene(hb));
		primaryStage.show();

	}

}