import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class Test11200 extends Application{
	// main()メソッド
	public static void main ( String[] args ) {
		launch( args );
	}
	// start() メドッソ
	public void start ( Stage stage ) throws Exception {
		//Label を　作る
		Label hello = new Label ( " Hello ");

		//Pane を作る
		BorderPane pane = new BorderPane();
		pane.setCenter( hello );

		// Scene をつくる
		Scene scene = new Scene ( pane,300,200 );
		// Scene を、Stageに、のせる
		stage.setScene ( scene );

		//window を表示する
		stage.show();
	}
}