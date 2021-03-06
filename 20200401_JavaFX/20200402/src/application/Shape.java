package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Shape {
	
	public Rectangle getRectangle(int x, int y, int w, int h, Color color){
		Rectangle rec = new Rectangle();
		rec.setFill(color);
		rec.setStroke(Color.BLUEVIOLET);
		rec.setX(x);
		rec.setY(y);
		rec.setWidth(w);
		rec.setHeight(h);
		
		return rec;
	}
	
	
	public Rectangle getRectangle(Color color, int x, int y, int w, int h){
		Rectangle rec = new Rectangle(w, h, color);
		rec.relocate(x, y);
		
		return rec;
	}
	
	
	public Circle getCircle(Color color, int x, int y, int r){
		Circle cir = new Circle(r, color);
		cir.relocate(x, y);
		
		return cir;
	}
	
	
	public Ellipse getEllipse(int x, int y, int rx, int ry) {
		Ellipse elli = new Ellipse(x, y, rx, ry);
		
		return elli;
	}
}
