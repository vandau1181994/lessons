import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.layout.Pane;
  import javafx.scene.canvas.Canvas;
  import javafx.scene.canvas.GraphicsContext;
  import javafx.animation.AnimationTimer;
  import javafx.scene.paint.Color;
  
  public class BreakoutMain4 extends Application {
    // data
    private BreakoutThread breakoutthread;
    
    // method
    public static void main ( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) {
      // settitle, pane, scene, setscene
      stage.setTitle( "BREAKOUT" );
      Pane pane = new Pane();
      Scene scene = new Scene( pane );
      stage.setScene( scene );
      
      // canvas, gc, add
      Canvas canvas = new Canvas( 640, 480 );
      GraphicsContext gc = canvas.getGraphicsContext2D();
      pane.getChildren().add( canvas );
      
      // breakoutthread, start
      breakoutthread = new BreakoutThread(gc);
      breakoutthread.start();
      
      // show
      stage.show();
    }
  }
  
  
  class BreakoutThread extends AnimationTimer {
    // data
    private GraphicsContext gc;
    private Ball ball;
    
    // method
    BreakoutThread( GraphicsContext gc ){
      this.gc = gc;
      
      // ボールの準備
      ball = new Ball();
    }
    
    @Override
    public void handle( long time ){					// 表示するメソッド
      // 画面表示を、ぜんぶ消す（きれいにする）
      gc.clearRect( 0, 0, 640, 480 );
      
      // ボールを表示する
      ball.draw( gc );
      
      // ボールを移動させる; 反射のために変更する
      ball.move();
    }
  }
  
  
  // Ballクラス
  class Ball {
    // data
    private int radius;
    private int x;
    private int y;
    private int x_speed;
    private int y_speed;
    
    // method
    public Ball() {
      this.radius = 10;
      this.x = 0;
      this.y = 0;
      this.x_speed = 1;
      this.y_speed = 1;
    }
    
    public void draw( GraphicsContext gc ) {
      // 色を決める
      gc.setFill( Color.BLACK );
      // 表示する
      gc.fillOval( 0, 0, this.r*2, this.r*2 );
    }
     
    public void move() {
      this.x += this.x_speed;
      this.y += this.y_speed;
    }
    
    public void change_x_speed()
    public void change_y_speed()
  }