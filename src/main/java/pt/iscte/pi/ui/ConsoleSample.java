package pt.iscte.pi.ui;

import java.io.PrintStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import pt.iscte.pi.controller.Console;

public class ConsoleSample extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea textArea = new TextArea();
		textArea.setPrefHeight(200);
		textArea.setPrefWidth(500);
		textArea.setWrapText(true);
		Console console = new Console(textArea);
		PrintStream printStream = new PrintStream(console, true);
		System.setOut(printStream);
		System.setErr(printStream);
		
		Scene scene = new Scene(textArea);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		for (char c: "some text".toCharArray()) {
			console.write(c);
		}
		
		printStream.close();
		
	}
	
}
