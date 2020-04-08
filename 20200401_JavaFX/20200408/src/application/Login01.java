package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button("OK");
		
		EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("��ư Ŭ�� ");
			}

		};
		
		btn.setPrefSize(100, 30);
		btn.setOnAction(eh);
		
		canvas.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
		
	}

}
