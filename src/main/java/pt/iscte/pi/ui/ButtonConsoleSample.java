package pt.iscte.pi.ui;

import java.io.IOException;
import java.io.PrintStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pt.iscte.pi.controller.Console;

public class ButtonConsoleSample extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Open Console Sample");
		Button button = new Button();
		button.setText("Open Console");
		button.setOnAction(event -> {
			TextArea textArea = new TextArea();
			textArea.setPrefHeight(200);
			textArea.setPrefWidth(500);
			textArea.setWrapText(true);
			Console console = new Console(textArea);
			PrintStream printStream = new PrintStream(console, true);
			System.setOut(printStream);
			System.setErr(printStream);
			
			Stage newStage = new Stage();
			newStage.setTitle("Console Log...");
			Scene scene = new Scene(textArea);
			newStage.setScene(scene);
			newStage.show();
			
			for (char c: "some text".toCharArray()) {
				try {
					console.write(c);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(button);
		primaryStage.setScene(new Scene(root, 300, 255));
		primaryStage.show();
	}
}
