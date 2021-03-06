package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ImageView01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();

		ImageView ta = new ImageView();
		ta.setImage(new Image("/img/universe.png"));
		ta.setLayoutX(20);
		ta.setLayoutY(20);

		ap.getChildren().add(ta);
		ap.setPrefSize(300, 200);

		primaryStage.setScene(new Scene(ap,700, 700));
		primaryStage.show();

	}

}
