package application;

import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Pane06 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int frameWidth = 720;
		int frameHeight = 500;
		int rectSize = 200;
		int rx = rectSize - 100;
		int ry = rectSize - 150;
		int margin = 10;
		
		
		Shape shape = new Shape();
		Rectangle rec1 = shape.getRectangle(Color.INDIANRED,
				frameWidth / 2 - rectSize / 2, frameHeight / 2 - rectSize / 2, rectSize, rectSize);
		
		Circle cir1 = shape.getCircle(Color.BLUEVIOLET,
				frameWidth / 2 - rectSize / 2, frameHeight / 2 - rectSize / 2, rectSize / 2);
		
		Ellipse elli1 = new Ellipse(
				frameWidth / 2, frameHeight / 2, rx, ry);
		
		
		Rectangle rec2 = shape.getRectangle(Color.BLACK,
				0, 0, frameWidth / 2 - margin * 2, frameHeight / 2 - margin * 2);
		
		Rectangle rec22 = shape.getRectangle(Color.DARKRED,
				frameWidth / 8, frameHeight / 8, frameWidth / 4 - margin * 2 , frameHeight / 4 - margin * 2);
		
		
		
		Rectangle rec3 = shape.getRectangle(Color.YELLOW,
				frameWidth / 2 , 0, frameWidth / 2 - margin * 2, frameHeight / 2 - margin * 2);
		
		Ellipse elli3 = new Ellipse(
				(frameWidth / 4) * 3, frameHeight / 4, frameWidth / 8, frameHeight / 16);
		
		
		
		
		
		
		Pane canvas = new Pane();
		canvas.setStyle("-fx-background-color : blue");
		canvas.setPrefSize(screenWidth, screenHeight);
		
		
		Group group1 = new Group();
		group1.getChildren().addAll(rec1, cir1, elli1);
		
		
		Group group2 = new Group();
		group2.relocate(margin, margin);
		group2.getChildren().addAll(rec2, rec22);
		
		
		Group group3 = new Group();
		group3.relocate(margin, margin);
		group3.getChildren().addAll(rec3, elli3);
		
		
		Group group4 = new Group();
		group4.relocate(margin, margin);
		group4.getChildren().add(
				shape.getRectangle(Color.FORESTGREEN,
						0, frameHeight / 2 , frameWidth - margin * 2, frameHeight / 2 - margin * 2));
		

		Group bigGroup = new Group();
//		bigGroup.getChildren().addAll(canvas, group1, group2, group3, group4);
		bigGroup.getChildren().addAll(canvas, group2, group3, group4, group1);
		
		Scene scene = new Scene(bigGroup, frameWidth, frameHeight);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane06");
		//primaryStage.setAlwaysOnTop(true);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
