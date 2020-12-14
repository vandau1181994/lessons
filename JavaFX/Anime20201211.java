  import javafx.animation.Animation;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
   
  public class Anime20201211 extends Application{
   
    public static void main(String[] args) {
      launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) {
      View v = new View();
      Scene scene = new Scene(v, 400, 300);
      primaryStage.setScene(scene);
      primaryStage.show();
    }
  }
  class View extends Group{
    public View() {
      Rectangle rect = new Rectangle(0,0,50,50);
      TranslateTransition animation = new TranslateTransition(Duration.seconds(1), rect);
      animation.setFromX(0);    
      animation.setFromY(0);   
      animation.setToX(350);    
      animation.setToY(250);    
      animation.setCycleCount( Animation.INDEFINITE );    
      animation.setCycleCount(3);   
      animation.setAutoReverse(true);  
      animation.setAutoReverse(false);
      animation.play(1);
      getChildren().add(rect);
      class View extends Group{

    Rectangle rect01 = new Rectangle(175,125,50,50);
    RotateTransition animation = new RotateTransition(Duration.seconds(3), rect01);
    animation.setFromAngle(0);
    animation.setToAngle(360);
    animation.setCycleCount(2);
    animation.setAutoReverse(true);
    animation.play(2);
    getChildren().add(rect01);
  }
}
    
  