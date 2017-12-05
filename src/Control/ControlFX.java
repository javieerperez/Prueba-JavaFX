package Control;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlFX {

	public void cambiarEscena() {
		try {
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainFX.class.getResource("FreeSolo.fxml"));
			BorderPane page = (BorderPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FREESOLO");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void handleSend() {
		cambiarEscena();
	}
}
