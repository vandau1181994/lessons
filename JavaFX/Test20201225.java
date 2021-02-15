import javafx.animation.Animation;
   import javafx.animation.ScaleTransition;
   import javafx.util.Duration;
   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Rectangle;
   
   public class Test20201225 extends Application {
     // main()
     public static void main( String[] args ) {
       launch( args );
     }
     
     // start()
     @Override
     public void start( Stage stage ) throws Exception {
       View v = new View();
       Scene scene = new Scene( v, 400, 300 );
       stage.setScene( scene );
       stage.show();
       scene.setOnMouseClicked(e -> v.changeColor() );
       
     }
   }

   
   class View extends Group {
    Rectangle rect;
     // constructor
     public View() {
       // shape, color
        rect = new Rectangle( 0, 0, 50, 40 );
       rect.setFill( Color.CYAN );
       
       // animation, setcyclecount, setautoreverse
       ScaleTransition animation = new ScaleTransition( Duration.seconds( 2 ), rect );
       animation.setFromX( 3 );
       animation.setFromY( 3);
       animation.setToX( 9);
       animation.setToY( 9 );
       animation.setCycleCount( Animation.INDEFINITE );
       animation.setAutoReverse( true );
       
       // play, add
       animation.play();
       getChildren().add( rect );
     }
     public void changeColor(){
      rect.setFill(Color.RED);
     }
   }
   