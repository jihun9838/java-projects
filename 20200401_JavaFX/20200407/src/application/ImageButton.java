package application;

import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageButton extends ToggleButton {

	private final String STYLE_NORMAL = "-fx-background-color: transparent; -fx-padding: 5, 5, 5, 5;";
	private final String STYLE_PRESSED = "-fx-background-color: transparent; -fx-padding: 6 4 4 6;";

	final String WARRIOR = "/img/warrior.png";
	final String ROGUE = "/img/Rogue.png";
	final String MAGE = "/img/magi.png";
	
	final String CHARWAR = "/png/characWarrior.png";
	final String CHARLOUGE= "/png/characLouge.png";
	final String CHARMAGE = "/png/characMage.png";

	final String IMGWAR = "/png/bigWarrior.png";
	final String IMGROUGE = "/png/bigRouge.png";
	final String IMGMAGE = "/png/bigMage.png";

	
	public ImageButton(String imageurl, int width, int height) {
		ImageView imgView = new ImageView(new Image(getClass().getResourceAsStream(imageurl)));
		imgView.setFitHeight(height);
		imgView.setFitWidth(width);
		setGraphic(imgView);
		setStyle(STYLE_NORMAL);

		setOnMousePressed(e->{
			setStyle(STYLE_PRESSED);
		});

		setOnMouseReleased(e-> {
			setStyle(STYLE_NORMAL);
		});


	}

}