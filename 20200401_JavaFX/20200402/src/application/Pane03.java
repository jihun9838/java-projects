package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Pane03 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		int width = 600;
		int height = 500;

		//Group g = new Group();
		Pane canvas = new Pane();
		Shape shape = new Shape();

		for(int i = 1 ; i < 10 ; ++i) {
			Rectangle rec = shape.getRectangle(20 * i, 20 * i, 10, 100, Color.AQUA);
			Circle cir = shape.getCircle(Color.FORESTGREEN, 600 - 30 * i, 500 - 30 * i, 10);
			canvas.getChildren().addAll(rec, cir);
		}

		Rectangle rec = shape.getRectangle(Color.RED, width / 2 - 20, height / 2 - 20, 80, 80);
		Circle cir = shape.getCircle(Color.BLUE, width / 2, height / 2, 20);
		
		canvas.setStyle("-fx-background-color : black");
		
		canvas.setPrefSize(200, 200);
		canvas.relocate(100, 100);
		canvas.getChildren().addAll(rec,cir);
		Group g = new Group(canvas);
		//g.getChildren().addAll(rec,cir);
		
//		Scene scene = new Scene(canvas, 600, 500, Color.BLUE);
		Scene scene = new Scene(g, 600, 500, Color.BLUE);
		primaryStage.setScene(scene);
		primaryStage.isAlwaysOnTop();
		primaryStage.setTitle("asdsdfsdfa");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
