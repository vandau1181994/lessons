import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.Group;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Polygon;
   
   public class Tamgiac extends Application {
     public static void main( String[] args ) {
       launch( args );
     }
     
     @Override
     public void start( Stage stage ) throws Exception {
       // group, scene
       Group root = new Group();
       Scene scene = new Scene( root, 500, 400 );
       
       // shape, color
       Polygon tamgiac = new Polygon( 100, 20, 130. 230, 250, 130 );
       tamgiac.setFill( Color.RED );
       
       // add, show
       root.getChildren().add( tamgiac );
       stage.setScene( scene );
       stage.show();
     }
   }