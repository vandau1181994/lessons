import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Test11271 extends Application {
	public static void main ( String[] args ){
		launch ( args );

	}
	@Override
	public void start ( Stage stage ) throws Exception{
		Label hello = new Label ("hello");
		TextField field = new TextField();
		Button button = new Button ("ok");
		button.setOnAction( new EventHandler<ActionEvent>(){
			@Override
			public void handle( ActionEvent e ){
				String data = field.getText();
				hello.setText(data);

			}
		});
		BorderPane pane = new BorderPane();
		pane.setTop( hello );
		pane.setCenter( field );
		pane.setBottom( button );
		Scene scene = new Scene ( pane,400,300);
		stage.setScene( scene );
		stage.show();
	}
}