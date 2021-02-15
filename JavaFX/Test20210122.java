import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Test20210122 extends Application {
	public static void main( String[] args ){
		launch( args );
	}
	@Override
	public void start( Stage stage ) throws Exception{
		//group,scene
		Group root = new Group();
		Scene scene = new Scene ( root,500,400);
		//circle
		Circle circle = new Circle(200,200,80);
		//color
		circle.setFill(Color.RED);
		//add
		root.getChildren().add(circle);
		//show
		stage.setScene(scene);
		stage.show();
	}
}