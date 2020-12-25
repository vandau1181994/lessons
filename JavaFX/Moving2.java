import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Moving2 extends Application{
	public static void main(String[] args){
		launch( args );
	}
	@Override
	public void start (Stage stage ) throws Exception{
		View v = new View();
		Scene scene = new Scene(v,400,300);
		stage.setScene( scene );
		stage.show();
		scene.setOnKeyPressed(e -> System.out.println("キー押されました"));
	}
}
class View extends Group{
	public View(){
		Rectangle rect = new Rectangle(0,0,60,70);
		rect.setFill( Color.GREEN);
		Rectangle rect2 = new Rectangle(230,30,80,80);
		rect2.setFill(Color.BLACK);
		TranslateTransition animation = new TranslateTransition(Duration.seconds(2),rect);
		animation.setFromX(-40);
		animation.setFromY(50);
		animation.setToX(200);
		animation.setToY(50);
		animation.setCycleCount( Animation.INDEFINITE );
		TranslateTransition animation1= new TranslateTransition(Duration.seconds(2),rect2);
		animation.setFromX(-50);
		animation.setFromY(50);
		animation.setToX(300);
		animation.setToY(50);
		animation.setCycleCount( Animation.INDEFINITE );
  
  		
  		animation.play();
  		animation1.play();
  		getChildren().add( rect );
  		getChildren().add( rect2 );
  		
  		
  		

  	}
  }
	
