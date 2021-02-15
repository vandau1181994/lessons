  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.layout.Pane;
  import javafx.scene.canvas.Canvas;
  import javafx.scene.canvas.GraphicsContext;
  import javafx.animation.AnimationTimer;

  
  public class BreakoutMain extends Application {
    //data
    private BreakoutThread breakoutthread;
    //method
    public static void main ( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) throws Exception {
      stage.setTitle( "BREAKOUT" );
      //pane,scene,setScene()
      Pane pane = new Pane();
      Scene scene = new Scene(pane);
      stage.setScene(scene);
      //Canvas ,GraphicsContext,add()
      Canvas canvas = new Canvas(640,480);
      GraphicsContext gc = canvas.getGraphicsContext2D();
      pane.getChildren().add(canvas);
      //thread; スレッドを実行する
      breakoutthread = new BreakoutThread(gc);
      breakoutthread.start();

      stage.show();
    }
  }
  class BreakoutThread extends AnimationTimer{
    //data
    private GraphicsContext gc;
    private int count;
    //method
    //constructor;コンストラクタ；newの時。1回だけ実行される
    BreakoutThread(GraphicsContext gc){
      this.gc = gc;
      count = 0;

    }
    @Override public void handle(long time ){
      gc.clearRect( 0,0,640,480);
      //文字を表示する
      gc.fillText("count = " + count,450,450);
      count++;
    }
  }