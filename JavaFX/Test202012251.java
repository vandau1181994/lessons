import javafx.animation.Animation;
   　 import javafx.animation.ScaleTransition;
   　 import javafx.util.Duration;
   　 import javafx.application.Application;
   　 import javafx.stage.Stage;
   　 import javafx.scene.Scene;
   　 import javafx.scene.Group;
   　 import javafx.scene.paint.Color;
   　 import javafx.scene.shape.Rectangle;
   　 
   　 public class Test202012251 extends Application {
   　   
   　   public static void main( String[] args ) {
   　     launch( args );
   　   }
   　   
   　   
   　   @Override
   　   public void start( Stage stage ) throws Exception {
   　     
   　     View v = new View();
   　     Scene scene = new Scene( v, 400, 300 );
   　     stage.setScene( scene );
   　     stage.show();
   　     
   　    
   　     scene.setOnMouseClicked( e -> v.changeAnimation() );
   　   }
   　 }
   　 
   　 class View extends Group {
   　   
   　   Rectangle rect;
   　   ScaleTransition animation;
   　   int flagAnimation = 0;
   　   
   　   
   　   public View() {
   　     rect = new Rectangle( 0, 0, 60, 50 );
   　     rect.setFill( Color.CYAN );
   　     
   　     animation = new ScaleTransition( Duration.seconds( 2 ), rect );
   　     animation.setFromX();
   　     animation.setFromY();
   　     animation.setToX();
   　     animation.setToY();
   　     animation.setCycleCount( Animation.INDEFINITE );
   　     animation.setAutoReverse( true );
   　     
   　     animation.play();
   　     getChildren().add( rect );
   　   }
   　   
   　   public void changeAnimation() {
   　     if ( flagAnimation == 0 ) {
   　       animation.pause();			
   　       flagAnimation = 1;		
   　     } else {
   　       animation.play();			
   　       flagAnimation = 0;		
   　     }
   　   }
   　 }