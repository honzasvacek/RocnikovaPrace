package application;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Controller {
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	public static long currentTime = 0;
	

	public void switchToMenu(ActionEvent e) throws IOException {
		//scene.setFill(Color.GRAY);
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	public void switchToReactionTest(ActionEvent e) throws IOException, InterruptedException {
		root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	public void switchToMemoryTest(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main3.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToReaction2(ActionEvent e) throws IOException, InterruptedException {
		Thread.sleep(5000);
		currentTime = System.currentTimeMillis();
		root = FXMLLoader.load(getClass().getResource("Reaction.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		

	}
	public void startWatch2(ActionEvent e) throws IOException {
		long stopTime = System.currentTimeMillis();	
		root = FXMLLoader.load(getClass().getResource("reactionEnd.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		long reactionTime = (stopTime - currentTime);
		System.out.println(reactionTime + " " + "milisekund");
		
	}
	
}
