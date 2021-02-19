import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.layout.Pane;
   import javafx.scene.paint.Color;
   import javafx.scene.canvas.Canvas;
   import javafx.scene.canvas.GraphicsContext;
   import javafx.animation.AnimationTimer;
   import javafx.scene.input.KeyEvent;
   import javafx.event.EventHandler;
   
   public class Bar extends Application{
    private BreakoutThread breakoutthread;
    public static void main(String[] args){
      launch( args );
    }
    @Override
    public void start( Stage stage ) {
      //key
      Key key = new Key(); //キーボード処理のクラス
      // title
      stage.setTitle( "bartest only" );
      
      // pane, scene
      Pane pane = new Pane();
      Scene scene = new Scene( pane );
      stage.setScene( scene );

      scene.setOnKeyPressed(
        new EventHandler<KeyEvent>(){
          public void handle(KeyEvent e){
            key.keyPressed(e);
          }
        });
      
      // canvas, graphicscontext
      Canvas canvas = new Canvas( 640, 480 );
      GraphicsContext gc = canvas.getGraphicsContext2D();
      pane.getChildren().add( canvas );
      
      // breakoutthread
      breakoutthread = new BreakoutThread( gc );
      breakoutthread.start();
      
      // show
      stage.show();
    }
  }
  
  
  class BreakoutThread extends AnimationTimer {
    // data
    private GraphicsContext gc;
    private Bar bar;
    
    // method
    public BreakoutThread( GraphicsContext gc ) {
      this.gc = gc;
      this.bar = new Bar();
    }
    
    @Override
    public void handle( long time ) {
      // 1回ぜんぶ消す
      gc.clearRect( 0, 0,  640, 480 );
      
      // 表示する
      ball.move();      // ballの新しい場所を決める
      ball.draw( gc );    // ballを描く
    }
  }
  
  
  class Ball {
    // data
    private int x;
    private int y;
    private int x_speed;
    private int y_speed;
    
    // method
    public Ball() {
      this.x = 20;        
      this.y = 20;
      this.x_speed = 5;
      this.y_speed = 5;
    }
    
    public void move() {      // ballの場所を計算する
      this.x += x_speed;
      this.y += y_speed;
    }
    
    public void draw( GraphicsContext gc ) {
      gc.setFill( Color.BLUE );   // ballの色を決める
      gc.fillOval( x, y, 20, 20 );  // ballを描く
    }
  }
class Key{
  public void keyPressed( KeyEvent e ){
    System.out.println( e.getCode() + " pressed. ");
  }
}
class Bar{
  private int x;
  private int y;
  private int width;
  private int height;
  public Bar(){
    this.x = 100;
    this.y = 470;
    this.width = 100;
    this.height = 10;
    }
public void draw( GraphicsContext gc){
  gc.setFill(Color,RED);
  gc.fillRect(x,y,width,height);
  
}
}