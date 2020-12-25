import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Polygon;
   import javafx.animation.Animation;
   import javafx.animation.TranslateTransition;
   import javafx.util.Duration;

   
   public class Triangle extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     
     @Override
     public void start( Stage stage ) throws Exception {
      View v = new View();
      Scene scene = new Scene(v,500,400);
      stage.setScene( scene );
      stage.show();
  }
  class View extends Group{
  	public View(){
  		Polygon triangle = new Polygon(100,20,130,230,250,130);
  		triangle.setFill(Color.BLUE);
  		TranslateTransition animation = new TranslateTransition( Duration.seconds(2),triangle);
  		animation.setFromX(0);
  		animation.setFromY(0);
  		animation.setToX(300);
  		animation.setToY(350);

  		animation.setCycleCount(Animation.INDEFINITE);
  		animation.setAutoReverse( true );
  		animation.play();
  		getChildren().add(triangle);
  	}
  }
      
       
       
     
   }