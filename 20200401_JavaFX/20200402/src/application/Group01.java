package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Group01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		int width = 600;
		int height = 500;

		Group g = new Group();
		Shape shape = new Shape();

		for(int i = 1 ; i < 10 ; ++i) {
			Rectangle rec = shape.getRectangle(20 * i, 20 * i, 10, 100, Color.AQUA);
			Circle cir = shape.getCircle(Color.FORESTGREEN, 600 - 30 * i, 500 - 30 * i, 10);
			g.getChildren().addAll(rec, cir);
		}

		Rectangle rec = shape.getRectangle(Color.RED, width / 2 - 20, height / 2 - 20, 80, 80);
		Circle cir = shape.getCircle(Color.BLUE, width / 2, height / 2, 20);
		g.getChildren().addAll(rec,cir);
		
		Scene scene = new Scene(g, 600, 500);
		primaryStage.setScene(scene);
		primaryStage.isAlwaysOnTop();
		primaryStage.setTitle("asdsdfsdfa");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
