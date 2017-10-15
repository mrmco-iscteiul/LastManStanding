package pt.iscte.pi.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormSample extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(sceneTitle, 0, 0, 2, 1);
		
		Label userName = new Label("User Name: ");
		grid.add(userName, 0, 1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		Label password = new Label("Password: ");
		grid.add(password, 0, 2);
		
		PasswordField passwordField = new PasswordField();
		grid.add(passwordField, 1, 2);
		
		Button button = new Button("Sign in");
		HBox hbButton = new HBox(10);
		hbButton.setAlignment(Pos.BOTTOM_RIGHT);
		hbButton.getChildren().add(button);
		grid.add(hbButton, 1, 4);
		
		final Text actionTarget = new Text();
		grid.add(actionTarget, 1, 6);
		
		button.setOnAction(event -> {
			actionTarget.setFill(Color.FIREBRICK);
			actionTarget.setText("Sign in button pressed");
		});
		
		primaryStage.show();
	}
	
}
