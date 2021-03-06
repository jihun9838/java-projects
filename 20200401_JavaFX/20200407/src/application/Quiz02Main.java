package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz02Main extends Application{
	final String WARRIOR = "/img/warrior.png";
	final String ROGUE = "/img/Rogue.png";
	final String MAGI = "/img/magi.png";
	final String ASTYLE = "/png/A.png";
	final String BSTYLE = "/png/B.png";
	final String CSTYLE = "/png/C.png";
	final String AMOTION = "/png/moveA.png";
	final String BMOTION = "/png/moveB.png";
	final String CMOTION = "/png/moveC.png";

	final String IMGCLASS = "/png/classButton.png";
	final String AXE = "/png/axe.png";
	final String REG = "/png/registerButton.png";

	final String IMGWAR = "/png/bigWarrior.png";
	final String IMGROGUE = "/png/bigLogue.png";
	final String IMGMAGE = "/png/bigMage.png";

	final String CHARWAR = "/png/characWarrior.png";
	final String CHARROGUE= "/png/characLogue.png";
	final String CHARMAGE = "/png/characMage.png";

	final String WAR_DESCRIPTION = " 워리어\n 칼과 창을 다루는데 능숙합니다. 근거리에서 강한 데미지를 주는 딜러입니다.";
	final String ROGUE_DESCRIPTION = " 로그\n 단검과 활을 다루는데 능숙합니다. 근거리, 원거리 문제없이 데미지를 주는 전천후 딜러입니다.";
	final String MAGE_DESCRIPTION = " 메이지\n 완드와 스태프를 다루는데 능숙합니다. 원거리에서 강한 데미지를 주는 딜러입니다.";

	final String UNIVERSE = "/png/universe.png";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stackPane = new StackPane();
		BorderPane mainBorder = new BorderPane();
		BorderPane leftBorder = new BorderPane();

		HBox bottomHbox = new HBox();
		HBox hJobbox = new HBox();
		HBox hHairbox = new HBox();
		HBox hMotionbox = new HBox();
		VBox vbox = new VBox();
		AnchorPane centerAnchorPane = new AnchorPane();
		Pane pane0 = new Pane();
		Pane pane2 = new Pane();
		Pane pane4 = new Pane();
		Pane pane6 = new Pane();
		Pane topPane = new Pane();
		Pane leftPane = new Pane();





		int bSize = 45;
		ImageButton warimgBtn = new ImageButton(WARRIOR, bSize, bSize);
		ImageButton rogueImgBtn = new ImageButton(ROGUE, bSize, bSize);
		ImageButton magiImgBtn = new ImageButton(MAGI, bSize, bSize);

		hJobbox.getChildren().addAll(warimgBtn, rogueImgBtn, magiImgBtn);
		hJobbox.setSpacing(-8);

		ImageButton imgHairBtnA = new ImageButton(ASTYLE, bSize, bSize);
		ImageButton imgHairBtnB = new ImageButton(BSTYLE, bSize, bSize);
		ImageButton imgHairBtnC = new ImageButton(CSTYLE, bSize, bSize);

		hHairbox.getChildren().addAll(imgHairBtnA, imgHairBtnB, imgHairBtnC);
		hHairbox.setSpacing(-8);

		ImageButton imgMotionBtnA = new ImageButton(AMOTION, bSize, bSize);
		ImageButton imgMotionBtnB = new ImageButton(BMOTION, bSize, bSize);
		ImageButton imgMotionBtnC = new ImageButton(CMOTION, bSize, bSize);

		hMotionbox.getChildren().addAll(imgMotionBtnA, imgMotionBtnB, imgMotionBtnC);
		hMotionbox.setSpacing(-8);

		pane0.setPrefHeight(27);
		pane2.setPrefHeight(33);
		pane4.setPrefHeight(23);
		vbox.getChildren().add(pane0);
		vbox.getChildren().add(hJobbox);
		vbox.getChildren().add(pane2);
		vbox.getChildren().add(hHairbox);
		vbox.getChildren().add(pane4);
		vbox.getChildren().add(hMotionbox);
		vbox.getChildren().add(pane6);
		//vbox.setStyle("-fx-background-color : Yellow");

		topPane.setPrefHeight(50);
		leftPane.setPrefWidth(16);
		//topPane.setStyle("-fx-background-color : green");
		leftBorder.setTop(topPane);
		leftBorder.setLeft(leftPane);
		leftBorder.setCenter(vbox);




		ImageButton classBtn = new ImageButton(IMGCLASS, bSize * 4, bSize - 5);
		TextArea textArea = new TextArea("닉네임 입력");
		ImageButton axeBtn = new ImageButton(AXE, bSize - 10, bSize - 10);
		ImageButton regBtn = new ImageButton(REG, bSize * 4, bSize - 5);

		textArea.setPrefSize(bSize * 4, bSize - 40);
		textArea.setOnMouseClicked(e ->{
			textArea.setText("");
		});
		textArea.setTranslateX(25);
		bottomHbox.setSpacing(22);
		regBtn.setTranslateX(-5);
		bottomHbox.getChildren().addAll(classBtn, textArea, axeBtn, regBtn);
		//bottomHbox.setStyle("-fx-background-color : green");



		ImageButton warCharBtn = new ImageButton(CHARWAR, bSize * 4, bSize * 7);
		ImageButton warBtn = new ImageButton(IMGWAR, bSize * 4, bSize * 4);
		Label warBtnLb = new Label(WAR_DESCRIPTION);
		warBtnLb.setPrefWidth(bSize * 4);
		warBtnLb.setWrapText(true);
		warBtnLb.setFont(new Font(15));
		warBtnLb.setTextFill(Color.WHITE);
		VBox warcharhBox = new VBox(warBtn, warBtnLb);
		warcharhBox.setPadding(new Insets(0,0,0,40));

		HBox warcharvBox = new HBox(warCharBtn, warcharhBox);
		warcharvBox.setLayoutX(70);

		centerAnchorPane.getChildren().addAll(warcharvBox);
		//centerAnchorPane.setStyle("-fx-background-color : green");
		
		warcharvBox.setVisible(true);
		

		
		
		
		
		
		ImageButton logueCharBtn = new ImageButton(CHARROGUE, bSize * 4, bSize * 7);
		ImageButton logueBtn = new ImageButton(IMGROGUE, bSize * 4, bSize * 4);
		Label logueBtnLb = new Label(ROGUE_DESCRIPTION);
		logueBtnLb.setPrefWidth(bSize * 4);
		logueBtnLb.setWrapText(true);
		logueBtnLb.setFont(new Font(15));
		logueBtnLb.setTextFill(Color.WHITE);
		VBox loguecharhBox = new VBox(logueBtn, logueBtnLb);
		loguecharhBox.setPadding(new Insets(0,0,0,40));

		HBox loguecharvBox = new HBox(logueCharBtn, loguecharhBox);
		loguecharvBox.setLayoutX(70);
		
		centerAnchorPane.getChildren().add(loguecharvBox);
		
		loguecharvBox.setVisible(false);
		
		
		
		
		
		
		
		ImageButton mageCharBtn = new ImageButton(CHARMAGE, bSize * 4, bSize * 7);
		ImageButton mageBtn = new ImageButton(IMGMAGE, bSize * 4, bSize * 4);
		Label mageBtnLb = new Label(MAGE_DESCRIPTION);
		mageBtnLb.setPrefWidth(bSize * 4);
		mageBtnLb.setWrapText(true);
		mageBtnLb.setFont(new Font(15));
		mageBtnLb.setTextFill(Color.WHITE);
		VBox magecharhBox = new VBox(mageBtn, mageBtnLb);
		magecharhBox.setPadding(new Insets(0,0,0,40));

		HBox magecharvBox = new HBox(mageCharBtn, magecharhBox);
		magecharvBox.setLayoutX(70);

		centerAnchorPane.getChildren().addAll(magecharvBox);

		magecharvBox.setVisible(false);

		
		
		
		warimgBtn.setOnMouseClicked(e ->{
			warcharvBox.setVisible(true);
			loguecharvBox.setVisible(false);
			magecharvBox.setVisible(false);
		});

		rogueImgBtn.setOnMouseClicked(e ->{
			warcharvBox.setVisible(false);
			loguecharvBox.setVisible(true);
			magecharvBox.setVisible(false);
		});
		
		magiImgBtn.setOnMouseClicked(e ->{
			warcharvBox.setVisible(false);
			loguecharvBox.setVisible(false);
			magecharvBox.setVisible(true);
		});



		mainBorder.setLeft(leftBorder);
		mainBorder.setBottom(bottomHbox);
		mainBorder.setCenter(centerAnchorPane);

		//stackPane.getChildren().addAll(new ImageView("/img/L2Char.png"), mainBorder);
		ImageView image = new ImageView("/img/L2Char.png");
		ImageView myImage= new ImageView(UNIVERSE);
		
		stackPane.getChildren().addAll(myImage, mainBorder);
		
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.setMaxWidth(700);
		primaryStage.setMaxHeight(450);
		primaryStage.show();
	}

}