package application;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageView02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		AnchorPane ap = new AnchorPane();

		ImageView iv1 = new ImageView("/img/smilerere.png");
		ImageView iv2 = new ImageView("/img/smilerere.png");
		
		// rotate
		iv2.setRotate(45);
		
		Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
		iv2.setViewport(viewportRect);
		iv2.setLayoutX(40);
		iv2.setLayoutY(200);
		ap.getChildren().add(iv2);
				
		
		hb.getChildren().addAll(iv1,ap);
		hb.setPrefSize(1024,  768);
		
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();

	}

}
