 import javafx.animation.Animaion;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
   
  public class Test20201211 extends Application{
   
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
  		animation.setFromX(0);		// 最初の場所:X
  		animation.setFromY(0);		// 最初の場所:Y
  		animation.setToX(350);		// 最後の場所:X
  		animation.setToY(250);		// 最後の場所:X
  		animation.setCycleCount( Animation.INDEFINITE );		// 何回アニメーションするか; 無限
  		 animation.setCycleCount(3);		// 何回アニメーションするか
  		 animation.setAutoReverse(true);	// 帰ってくるアニメーション
  		 animation.setAutoReverse(false);
  		animation.play();
  		getChildren().add(rect);
  	}
  }