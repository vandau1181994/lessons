import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
public class BreakoutMain2 extends Application{
  //data
  private BreakoutThread breakoutthread;
  //method
  public static void main(String[] args ){
    launch( args );
  }
  @Override
  public void start(Stage stage){
    //settitle,pane,scene,setscene
    stage.setTitle("BREAKOUT");
    Pane pane = new Pane();
    Scene scene = new Scene(pane);
    stage.setScene(scene);
    //canvas,gc,add
    Canvas canvas = new Canvas(640,480);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    pane.getChildren().add( canvas );
    //breakoutthread,start
    breakoutthread = new BreakoutThread(gc);
    breakoutthread.start();
    //show
    stage.show();

  }
}
class BreakoutThread extends AnimationTimer{
  //data
  private GraphicsContext gc;
  private int ball_x; //ボールの場所; x
  private int ball_y;
  private int x_speed; // ボールの速さ；ｘ方向
  private int y_speed;
  //method 
  BreakoutThread( GraphicsContext gc ){
    this.gc = gc;
    ball_x = 0;
    ball_y = 0;
    x_speed = 1;
    y_speed = 1;
    }
    @Override
    public void handle(long time){
      //画面表示を、全部消す（きれいにする）
      gc.clearRect(0,0,640,480);
      //ボールを表示する
      gc.setFill( Color.BLACK);
      gc.fillOval(ball_x - 5, ball_y - 5, 10,10);
      //ボールを移動させる
      ball_x += x_speed;
      ball_y += y_speed;
    }
  }
