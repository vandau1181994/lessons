import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
public class Test202012111 extends Application{
	public static void main(String [] args ){


	launch( args );// bat dau
}
@Override
public void start(Stage stage) throws Exception{
	View v = new View();
	Scene scene = new Scene( v, 400,300 );
	stage.setScene( scene );
	stage.show();
}
}
class View extends Group{
	public View(){
		//rectangle, hinh chu nhat
		Rectangle rect = new Rectangle(200,150,50,50);
		rect.setFill( Color.BLUE);
		//transition;from-to , su chuyen tiep
		ScaleTransition animation = new ScaleTransition( Duration.seconds(1),rect);
		animation.setFromX(1);
		animation.setFromY(1);
		animation.setToX(3);
		animation.setToY(3);
		//cyclecount
		animation.setCycleCount(Animation.INDEFINITE);
		//play,add
		animation.play();
		getChildren().add(rect);
	}
}