package application;


import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageGame extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Toolkit tk = Toolkit.getDefaultToolkit();
		int screenWidth = tk.getScreenSize().width;
		int screenHeight = tk.getScreenSize().height;
		int frameWidth = 480;
		int frameHeight = 270;
		int posX = 0;
		int posY = 0;
		int score = 0;


		System.out.println("screenWidth : " + screenWidth);
		System.out.println("screenHeight : " + screenHeight);
		System.out.println("frameWidth : " + frameWidth);
		System.out.println("frameHegith : " + frameHeight);


		Rectangle rec = new Rectangle(frameWidth, frameHeight);
		rec.setFill(Color.FORESTGREEN);
		rec.setStroke(Color.ORANGERED);

		Text text = new Text(frameWidth / 4, frameHeight / 2, "!! CLICK ME !!");
		text.setFont(new Font(40));

		//BorderPane root = new BorderPane();
		Group root = new Group(rec, text);
		Scene scene = new Scene(root, frameWidth, frameHeight);
		
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				rec.setFill(Color.CORAL);
			}
		};
		root.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		
			
		
		primaryStage.setScene(scene);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.show();
		
		Thread.sleep(1000);
		primaryStage.hide();
		

		//		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
		//			@Override
		//			public void handle(MouseEvent event) {
		//				rec.setFill(Color.CORAL);
		//			}
		//		};
		//		rec.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);



		
		
//		root.setOnMouseClicked(new EventHandler<MouseEvent>() {
//			public void handle(MouseEvent event) {
//				if(event.getClickCount() > 0) {
//					System.out.println("MouseEvent : MouseClicked");
//				}
//			}
//		});

		//generateThreadWait(1000);

		System.out.println("Game Start");
//		int t = 20;
//		while(t-- > 0) {
//
//			posX = new Random().nextInt(screenWidth - frameWidth);
//			posY = new Random().nextInt(screenHeight - frameHeight);
//			//			posX = new Random().nextInt(600);
//			//			posY = new Random().nextInt(500);
//
//
//			primaryStage.setX(posX);
//			primaryStage.setY(posY);
//			primaryStage.show();
//			generateThreadWait(1000);
//			primaryStage.hide();
//			System.out.println("RUNNING");
//			//Thread.sleep(5000);
//			//primaryStage.hide();
//
//
//			score++;
//			System.out.println(score);
//
//		}

		primaryStage.close();
	}




	private synchronized void generateThreadWait(int time) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		try {
			//			System.out.println("Inside synchronized block entry..." + dtf.format(LocalDateTime.now()));
			//			this.wait(time)
			Thread.sleep(time);
			//			System.out.println("Inside synchronized block exit..." + dtf.format(LocalDateTime.now()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
