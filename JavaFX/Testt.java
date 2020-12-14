import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class Testt extends Application{
	// main()メソッド
	public static void main ( String[] args ) {
		launch( args );
	}
	// start() メドッソ
	public void start ( Stage stage ) throws Exception {
		//Label を　作る
		Label hello1 = new Label ( " Hello,JavaFX!");

		Label hello = new Label ( " グエンヴァンダウ　");
		Label hello2 = new Label ( "IG12" );

		//Pane を作る
		BorderPane pane = new BorderPane();
		pane.setCenter( hello );
		pane.setTop( hello1);
		pane.setBottom ( hello2 );

		// Scene をつくる
		Scene scene = new Scene ( pane,300,200 );
		// Scene を、Stageに、のせる
		stage.setScene ( scene );


		//window を表示する
		stage.show();
	}
}