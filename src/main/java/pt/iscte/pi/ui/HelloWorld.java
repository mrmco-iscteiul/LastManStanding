package pt.iscte.pi.ui;

import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World!");
		Button button = new Button();
		button.setText("Say 'Hello World'");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!!!");
			}
		});
		
		StackPane root = new StackPane();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("images/backgrounds/bg1.gif");
		Image image = new Image(inputStream);

		root.getChildren().add(button);
		Scene scene = new Scene(root, 300, 250);

		ImagePattern pattern = new ImagePattern(image);
		scene.setFill(pattern);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
