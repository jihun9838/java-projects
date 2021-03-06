package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Pane05VSGroup extends Application{

	int score = 0;
	@Override
	public void init() throws Exception {
		super.init();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane pane = new Pane();
		VBox.setVgrow(pane, Priority.NEVER);

		Group group = new Group();
		VBox.setVgrow(group, Priority.NEVER);

		VBox vbox = new VBox(group, pane);
		

		Shape shape = new Shape();
		Rectangle rec1 = shape.getRectangle(Color.RED, 100, 100, 100, 100);
		Rectangle rec2 = shape.getRectangle(Color.BLUE, 100, 100, 100, 100);
		Rectangle rec3 = shape.getRectangle(Color.RED, 200, 200, 100, 100);
		Rectangle rec4 = shape.getRectangle(Color.BLUE, 200, 200, 100, 100);
		
		rec1.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
			score++;
			System.out.println("score : " + score);
			
		});

		Scene scene = new Scene(vbox, 400, 500);
		
		group.getChildren().addAll(rec1, rec3);
		pane.getChildren().addAll(rec2, rec4);
		
		scene.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
			double deltax;
			switch (e.getCode()) {
			case LEFT:
				deltax = -10;
				break;

			case RIGHT:
				deltax=10;	
				break;

			default:
				deltax = 0;
				break;
			}
			rec3.setX(rec3.getX() + deltax);
			rec4.setX(rec4.getX() + deltax);
		});

		


		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
}
