import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
 public class Game03 extends Application{
 	public static void main( String[] args ){
 		launch( args );
 	}
 	@Override
 	public void start (Stage stage ) throws Exception{
 		// group, scene
 		Group root = new Group();
 		Scene scene = new Scene ( root, 500, 400 );
 		//circle; Circle( x,y, radius)
 		Circle circle = new Circle(250,200,80);
 		//color
 		circle.setFill( Color.BLUE);
 		//add
 		root.getChildren().add(circle);
 		//show
 		stage.setScene( scene );
 		stage.show();
 	}
 }