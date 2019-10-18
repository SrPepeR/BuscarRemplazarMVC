package dad.javafx.buscarReemplazar.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;
	
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		Scene scene = new Scene(controller.getRoot(), 550, 200);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
