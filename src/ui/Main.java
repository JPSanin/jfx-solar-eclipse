package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxml= new FXMLLoader(getClass().getResource("solar-eclipse.fxml"));
		SolarEclipseGUI se = new SolarEclipseGUI(primaryStage);
		fxml.setController(se);
		Parent root=fxml.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Solar Eclipse");
		primaryStage.show();
		
	}

}
