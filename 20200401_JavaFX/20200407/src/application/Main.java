package application;
	


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	      HBox hbox = new HBox(10);
	      Label imgLabel = new Label("Search", new ImageView("/img/search.png"));
	      Label rotateLabel = new Label("values");
	      Label wrappedLabel = new Label("A label that needs to be wrapped");
	      HBox wrappedHbox = new HBox(); 
	      
	      imgLabel.setFont(new Font("Arial", 25));
	      imgLabel.setTextFill(Color.web("#0076a3"));
	      
	      rotateLabel.setFont(new Font("Arial", 35));
	      rotateLabel.setRotate(270);
	      rotateLabel.setTranslateY(60);
	      
	      wrappedLabel.setWrapText(true);
	      
	      wrappedHbox.setPadding(new Insets(40, 0, 0, 0));
	      wrappedHbox.setPrefSize(100, 100);
	      wrappedHbox.getChildren().add(wrappedLabel);
	      
	      imgLabel.setOnMouseEntered(e->{
	         imgLabel.setScaleX(1.5);
	         imgLabel.setScaleY(1.5);
	      });
	      imgLabel.setOnMouseExited(e->{
	         imgLabel.setScaleX(1);
	         imgLabel.setScaleY(1);
	      });
	      
	      rotateLabel.setOnMouseEntered(e->{
	         rotateLabel.setScaleX(1.5);
	         rotateLabel.setScaleY(1.5);
	      });
	      rotateLabel.setOnMouseExited(e->{
	         rotateLabel.setScaleX(1);
	         rotateLabel.setScaleY(1);
	      });
	      
	      wrappedLabel.setOnMouseEntered(e->{
	         wrappedLabel.setScaleX(1.5);
	         wrappedLabel.setScaleY(1.5);
	      });
	      wrappedLabel.setOnMouseExited(e->{
	         wrappedLabel.setScaleX(1);
	         wrappedLabel.setScaleY(1);
	      });
	      
	      hbox.getChildren().addAll(imgLabel, wrappedHbox);
	      primaryStage.setScene(new Scene(hbox, 400, 170));
	      primaryStage.show();
	      
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
