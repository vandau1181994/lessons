import javafx.application.Application;
  import javafx.scene.Group;
  import javafx.scene.ParallelCamera;
  import javafx.scene.Scene;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Rectangle;
  import javafx.scene.shape.Circle;
  import javafx.stage.Stage;
  
  public class Gane03 extends Application {
    public static void main( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) throws Exception {
      // Group, Scene
      Group root = new Group();
      Scene scene = new Scene( root, 400, 300 );
      
      // □、〇
      Rectangle rect01 = new Rectangle( 100, 100, 50, 50 );
      Rectangle rect02 = new Rectangle( 250, 100, 50, 50 );
      Circle circle = new Circle( 200, 200, 20 );
      
      // □、〇に色を付けて、Groupに入れる
      rect01.setFill( Color.RED );
      rect02.setFill( Color.BLUE );
      circle.setFill( Color.BLACK );
      root.getChildren().add( rect01 );
      root.getChildren().add( rect02 );
      root.getChildren().add( circle );
      
      // 表示する
      stage.setScene( scene );
      stage.show();
      }
    }
        class View extends Group{
    public View() {
      Rectangle rect01 = new Rectangle(0,0,50,50);
      TranslateTransition animation = new TranslateTransition(Duration.seconds(1), rect01);
      animation.setFromX(0);    
      animation.setFromY(0);   
      animation.setToX(350);    
      animation.setToY(250);    
      animation.setCycleCount( Animation.INDEFINITE );    
      animation.setCycleCount(3);   
      animation.setAutoReverse(true);  
      animation.setAutoReverse(false);
      animation.play();
      getChildren().add(rect01);

  
  
