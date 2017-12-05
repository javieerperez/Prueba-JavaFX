package Control;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControlFX {
	
	@FXML
	Stage stage;
	Scene scene2;
	
	@FXML
	public void cambiarEscena() throws Exception {
		stage.setScene(scene2);
	}
}
