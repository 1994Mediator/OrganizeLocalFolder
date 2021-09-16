package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Display extends Application{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		//パネル定義
		Group grp = new Group();
		Canvas cvs = new Canvas(600,600);
		Scene s = new Scene(grp,600,600);

		//各種パネルセット
		arg0.setScene(s);
		grp.getChildren().add(cvs);

		//ウィンドウ表示
		arg0.show();

		//描画
		GraphicsContext g = cvs.getGraphicsContext2D();
		g.setFill(Color.GREEN);
		g.fillRect(10, 10, 50, 50);
	}

}
