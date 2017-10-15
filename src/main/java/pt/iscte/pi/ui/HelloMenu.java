package pt.iscte.pi.ui;

import java.io.IOException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloMenu extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Load the image
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("images/backgrounds/bg1.gif");
		Image image = new Image(inputStream);
		
		// Simple displays ImageView the image as is
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root);
		
		scene.setFill(Color.BLACK);
		HBox box = new HBox();
		box.getChildren().add(imageView);
		root.getChildren().add(box);
		
		primaryStage.setTitle("ImageView");
		primaryStage.setWidth(415);
		primaryStage.setHeight(200);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
}
