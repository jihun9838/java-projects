package application;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TableView01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		AnchorPane ap = new AnchorPane();
//
//		TableView<Person> table = new TableView<Person>();
//
//		TableColumn<Person, String> firstNameCo1 = new TableColumn<Person, String>("FirstName");
//		firstNameCo1.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
//		TableColumn<Person, String> lastNameCo1 = new TableColumn<Person, String>("LastName");
//		lastNameCo1.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
//
//		//table.getColumns().setAll(firstNameCo1, lastNameCo1);
//
//		ObservableList<Person> phoneList = FXCollections.observableArrayList();
//		ObservableList<Person> phoneList = FXCollections.observableArrayList(
//				new Person(new SimpleStringProperty("cho"), new SimpleStringProperty("Younki")),
//				new Person(new SimpleStringProperty("cho"), new SimpleStringProperty("Younki")),
//				);
//
//		ap.getChildren().add(table);
//		ap.setPrefSize(300, 200);
//
//		primaryStage.setScene(new Scene(ap));
//		primaryStage.show();

	}

}