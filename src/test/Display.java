package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Display extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		//パネル定義
		Parent root = FXMLLoader.load(getClass().getResource("InitialCanvas.fxml"));  //  FXMLの内容を代入
		Scene s = new Scene(root,600,600);

		//各種パネルセット
		arg0.setScene(s);

		//ウィンドウ表示
		arg0.show();
	}
}
